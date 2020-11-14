package com.my.test;

import com.my.app.APPConfig;
import com.my.services.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {

	public static void main(String[] args) {


		/**
		 * 依赖注入关键的类
		 * IOC容器: 1. BeanFactory 2.AbstractBeanFactory
		 * 初始化获得BeanDefinition : SimpleInstantiationStrategy
		 * 依赖注入: AbstractPropertyAccessor 完成了属性的注入
		 * 真正实例化获得BeanWrapper
		 */
		AnnotationConfigApplicationContext ac  =
				new AnnotationConfigApplicationContext(APPConfig.class);

		// spring scan  扫描一个类
//		GenericBeanDefinition gd = new GenericBeanDefinition();
//		gd.setBeanClass(IndexService.class);
//		gd.setBeanClassName("indexService");
//		gd.setScope("singleton");  是否单例啊 等等等等操作
		// 然后放入DefaultListableBeanFactory.benDefinitionMap
		//benDefinitionMap.put("indexService",gd) GenericBeanDefinition 用来描述bean的

		OrderService o1 = ac.getBean(OrderService.class);
		OrderService o2 = ac.getBean(OrderService.class);
		System.out.println(o1 == o2);

	}
}
