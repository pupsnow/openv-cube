package com.openv.spring3x.aop;

import org.springframework.beans.factory.annotation.Configurable;

/**
 * 
 * <pre>
 * ֤ȯ�ʺţ��������
 * </pre>
 * @author luoshifei  luoshifei@yahoo.cn
 * @version 1.00.00
 * <pre>
 * �޸ļ�¼
 *    �޸ĺ�汾:     �޸��ˣ�  �޸�����:     �޸�����: 
 * </pre>
 */
@Configurable
public class SecurityAccount {
	
	private IBankSecurityService bankSecurityService;

//	public SecurityAccount() {
//		Assert.notNull(this.bankSecurityService);
//	}
	
	public void setBankSecurityService(IBankSecurityService bankSecurityService) {
		this.bankSecurityService = bankSecurityService;
	}

	public void toBank(Double money){
		this.bankSecurityService.securityToBank(money);
	}
	
	public void toSecurity(Double money){
		this.bankSecurityService.bankToSecurity(money);
	}
	
	private String accountId;
	
	private String accountPwd;
	
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountPwd() {
		return accountPwd;
	}

	public void setAccountPwd(String accountPwd) {
		this.accountPwd = accountPwd;
	}
		
}
