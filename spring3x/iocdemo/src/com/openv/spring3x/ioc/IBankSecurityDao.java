package com.openv.spring3x.ioc;

/**
 * <pre>
 * ����ȯ��DAO��
 * </pre>
 * @author luoshifei  luoshifei@yahoo.cn
 * @version 1.00.00
 * <pre>
 * �޸ļ�¼
 *    �޸ĺ�汾:     �޸��ˣ�  �޸�����:     �޸�����: 
 * </pre>
 */
public interface IBankSecurityDao {

	public abstract void bankToSecurity(Double money);

	public abstract void securityToBank(Double money);
	
}
