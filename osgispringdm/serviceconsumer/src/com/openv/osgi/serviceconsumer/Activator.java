package com.openv.osgi.serviceconsumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

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

	private ServiceTracker serviceTracker;
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		this.serviceTracker = new ServiceTracker(context, IQueryBankAccount.class.getName(), null);
		this.serviceTracker.open();
		IQueryBankAccount queryBankAccount = (IQueryBankAccount)this.serviceTracker.getService();
		System.out.println(queryBankAccount.queryAccountBalance("101202303"));
		System.out.println(queryBankAccount.queryAccountBalance("606404202"));
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		this.serviceTracker.close();
	}

}
