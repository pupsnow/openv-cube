package com.openv.spring3x.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * <pre>
 * ����ȯ�̼�ת�ʷ���
 * </pre>
 * @author luoshifei  luoshifei@yahoo.cn
 * @version 1.00.00
 * <pre>
 * �޸ļ�¼
 *    �޸ĺ�汾:     �޸��ˣ�  �޸�����:     �޸�����: 
 * </pre>
 */
public class BankSecurityServiceImpl implements IBankSecurityService {

	private static final Log log = LogFactory.getLog(BankSecurityServiceImpl.class);
	
	public void bankToSecurity(Double money){
		log.info("����������ת��" + money + "Ԫ��ȯ��");
	}
	
	public void securityToBank(Double money){
		log.info("������ȯ��ת��" + money + "Ԫ������");
	}

}
