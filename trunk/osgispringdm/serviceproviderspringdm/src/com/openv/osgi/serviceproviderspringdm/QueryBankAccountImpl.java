/**
 * 
 */
package com.openv.osgi.serviceproviderspringdm;

import java.util.HashMap;
import java.util.Map;

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
public class QueryBankAccountImpl implements IQueryBankAccount{

	private static final Map<String, Double> bankAccountMap = 
		new HashMap<String, Double>();
	
	public QueryBankAccountImpl() {
		//提供虚拟的银行帐号、余额信息
		bankAccountMap.put("101202303", new Double(10000.01));
		bankAccountMap.put("606404202", new Double(20000.51));
	}
	
	public Double queryAccountBalance(String accountId) {
		System.out.println("成功查询到银行帐户余额！");
		return bankAccountMap.get(accountId);
	}
	
}
