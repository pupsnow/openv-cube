package com.openv.spring3x.ioc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

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
public class BankSecurityDaoImpl implements IBankSecurityDao {

	private static final Log log = LogFactory.getLog(BankSecurityDaoImpl.class);
	
	public void bankToSecurity(Double money){
		log.info("����������ת��" + money + "Ԫ��ȯ��");
	}
	
	public void securityToBank(Double money){
		log.info("������ȯ��ת��" + money + "Ԫ������");
	}

}
