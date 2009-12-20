package com.openv.spring3x.ioc;


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
