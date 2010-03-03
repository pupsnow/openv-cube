/**
 * 
 */
package com.openv.osgi.serviceproviderspringdm;

import java.util.HashMap;
import java.util.Map;

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
public class QueryBankAccountImpl implements IQueryBankAccount{

	private static final Map<String, Double> bankAccountMap = 
		new HashMap<String, Double>();
	
	public QueryBankAccountImpl() {
		//�ṩ����������ʺš������Ϣ
		bankAccountMap.put("101202303", new Double(10000.01));
		bankAccountMap.put("606404202", new Double(20000.51));
	}
	
	public Double queryAccountBalance(String accountId) {
		System.out.println("�ɹ���ѯ�������ʻ���");
		return bankAccountMap.get(accountId);
	}
	
}
