package com.openv.osgi.serviceprovider;

import java.util.Properties;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.openv.osgi.serviceprovider.interfaces.IQueryBankAccount;

/**
 * 
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
		System.out.println("成功注册服务！");
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		serviceRegistration.unregister();
		System.out.println("成功注销服务！");
	}

}
