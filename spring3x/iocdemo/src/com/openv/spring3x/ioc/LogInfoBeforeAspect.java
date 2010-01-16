package com.openv.spring3x.ioc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * <pre>
 * ���������־AspectJ AOP����
 * </pre>
 * @author luoshifei  luoshifei@yahoo.cn
 * @version 1.00.00
 * <pre>
 * �޸ļ�¼
 *    �޸ĺ�汾:     �޸��ˣ�  �޸�����:     �޸�����: 
 * </pre>
 */
@Aspect
public class LogInfoBeforeAspect {

	private static final Log log = LogFactory.getLog(LogInfoBeforeAspect.class);
		
	@Before("execution(* *.*(..))")
	public void invokeInfo(JoinPoint thisJoinPoint){
		Signature signature = thisJoinPoint.getSignature();
		log.info(signature.toString());
	}

}