package com.openv.spring3x.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
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
public class ApplicationContextDemo {

	public static void main(String[] args) {		
		//��classpath·����װ��XML������Ϣ
		ApplicationContext applicationContext = 
			new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		//����ܹ�Bean
		IBankSecurityService bankSecurityService = 
			applicationContext.getBean(IBankSecurityService.class);
		
		bankSecurityService.bankToSecurity(2000.00);
		bankSecurityService.securityToBank(2000.00);
	}

}
