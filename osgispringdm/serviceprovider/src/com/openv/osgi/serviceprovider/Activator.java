package com.openv.osgi.serviceprovider;

import java.util.Properties;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.openv.osgi.serviceprovider.interfaces.IQueryBankAccount;

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
public class Activator implements BundleActivator {

	private ServiceRegistration serviceRegistration;
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		IQueryBankAccount queryBankAccount = new QueryBankAccountImpl();
		
		Properties properties = new Properties();
		properties.put("BANK", "CMB");

		serviceRegistration = context.registerService(IQueryBankAccount.class
				.getName(), queryBankAccount, properties);
		System.out.println("�ɹ�ע�����");
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		serviceRegistration.unregister();
		System.out.println("�ɹ�ע������");
	}

}
