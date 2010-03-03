/**
 * 
 */
package com.openv.osgi.serviceconsumerspringdm;

import org.springframework.beans.factory.InitializingBean;

import com.openv.osgi.serviceproviderspringdm.interfaces.IQueryBankAccount;

/**
 * <pre>
 * 程序的中文名称
 * </pre>
 * @author luoshifei  luoshifei@yahoo.cn
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容: 
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
