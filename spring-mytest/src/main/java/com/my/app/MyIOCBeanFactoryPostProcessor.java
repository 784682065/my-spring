package com.my.app;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class MyIOCBeanFactoryPostProcessor implements BeanFactoryPostProcessor {




	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("执行postProcessBeanFactory");
		GenericBeanDefinition orderService = (GenericBeanDefinition) beanFactory.getBeanDefinition("orderService");

		orderService.setScope("singleton");



		beanFactory.getBeanDefinition("orderService");

	}
}
