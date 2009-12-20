package com.openv.spring3x.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * <pre>
 * ��ʾConfigurableע���ʹ��
 * </pre>
 * @author luoshifei  luoshifei@yahoo.cn
 * @version 1.00.00
 * <pre>
 * �޸ļ�¼
 *    �޸ĺ�汾:     �޸��ˣ�  �޸�����:     �޸�����: 
 * </pre>
 */
public class ConfigurableDemo{

	protected static final Log log = LogFactory.getLog(ConfigurableDemo.class);

	public static void main(String[] args) {
		
		//����Spring DI�������AspectJ 6��������ù��������罫IoC������¶������
		new ClassPathXmlApplicationContext("ltw.xml");
				
		log.info("���������������");
		
		//�ܶ�ʱ��Hibernate/JPA/Ӧ�ô���Ḻ�𴴽��������
		SecurityAccount securityAccount = new SecurityAccount();
		
		log.info("AspectJ 6�Ѿ�����������������ù���");
		
		//û����ʽ����securityAccount��������Э���ߣ���IBankSecurityService����ȷʵ������null
		securityAccount.toBank(10000.00);
		securityAccount.toSecurity(10000.00);
		
	}
	
}
