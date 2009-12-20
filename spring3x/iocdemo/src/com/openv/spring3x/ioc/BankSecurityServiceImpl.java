package com.openv.spring3x.ioc;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;


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

	@Autowired
	private IBankSecurityDao bankSecurityDao;
	
	private Properties properties;	
	
	public BankSecurityServiceImpl() {
	}

	public BankSecurityServiceImpl(IBankSecurityDao bankSecurityDao) {
		this.bankSecurityDao = bankSecurityDao;
	}

	public BankSecurityServiceImpl(IBankSecurityDao bankSecurityDao, Properties properties) {
		this.bankSecurityDao = bankSecurityDao;
		this.properties = properties;
	}
	
	public void setBankSecurityDao(IBankSecurityDao bankSecurityDao) {
		this.bankSecurityDao = bankSecurityDao;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	public void bankToSecurity(Double money){
		this.bankSecurityDao.bankToSecurity(money);
	}
	
	public void securityToBank(Double money){
		this.bankSecurityDao.securityToBank(money);
	}

}

