package com.openv.spring3x.ioc;


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
public class BankSecurityServiceImpl implements IBankSecurityService {

	private IBankSecurityDao bankSecurityDao;
	
	public void setBankSecurityDao(IBankSecurityDao bankSecurityDao) {
		this.bankSecurityDao = bankSecurityDao;
	}
	
	public void bankToSecurity(Double money){
		this.bankSecurityDao.bankToSecurity(money);
	}
	
	public void securityToBank(Double money){
		this.bankSecurityDao.securityToBank(money);
	}

}
