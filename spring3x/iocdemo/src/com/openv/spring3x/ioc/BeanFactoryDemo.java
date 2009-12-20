package com.openv.spring3x.ioc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

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
public class BeanFactoryDemo {

	protected static final Log log = LogFactory.getLog(BeanFactoryDemo.class);

	public static void main(String[] args) {
		//��classpath·����װ��XML������Ϣ
		Resource resource = new ClassPathResource("beanfactory.xml");
		
		//ʵ����IoC��������ʱ��������δʵ����beanfactory.xml������ĸ����ܹ�Bean
		BeanFactory factory = new XmlBeanFactory(resource);
		
		//����ܹ�Bean
		IBankSecurityService bankSecurityService = 
			(IBankSecurityService) factory.getBean("bankSecurityService");
		
		bankSecurityService.bankToSecurity(2000.00);
		bankSecurityService.securityToBank(2000.00);
	}

}
