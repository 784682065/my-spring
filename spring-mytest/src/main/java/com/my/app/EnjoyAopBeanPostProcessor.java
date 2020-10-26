package com.my.app;

import com.my.services.EnjoyInvocationHandler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;

/**
 * @Author: huzp
 * @Description:
 * @Date: Created in  10:49 2020/10/26
 * @param:
 */
public class EnjoyAopBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		Object o = null;
		if (beanName.equals("AOPIndexService")) {
			System.out.println("aOPIndexService 222222222222222");
			Class<?>[] interfaces = bean.getClass().getInterfaces();
			o = Proxy.newProxyInstance(EnjoyAopBeanPostProcessor.class.getClassLoader(),
					interfaces,
					new EnjoyInvocationHandler(bean));
		}
		return o;
	}
}
