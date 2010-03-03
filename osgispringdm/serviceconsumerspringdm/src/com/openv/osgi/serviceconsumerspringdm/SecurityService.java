/**
 * 
 */
package com.openv.osgi.serviceconsumerspringdm;

import org.springframework.beans.factory.InitializingBean;

import com.openv.osgi.serviceproviderspringdm.interfaces.IQueryBankAccount;

/**
 * <pre>
 * �������������
 * </pre>
 * @author luoshifei  luoshifei@yahoo.cn
 * @version 1.00.00
 * <pre>
 * �޸ļ�¼
 *    �޸ĺ�汾:     �޸��ˣ�  �޸�����:     �޸�����: 
 * </pre>
 */
public class SecurityService implements InitializingBean{

	private IQueryBankAccount queryBankAccount;

	public void setQueryBankAccount(IQueryBankAccount queryBankAccount) {
		this.queryBankAccount = queryBankAccount;
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println(queryBankAccount.queryAccountBalance("101202303"));
		System.out.println(queryBankAccount.queryAccountBalance("606404202"));
	}
	
}
