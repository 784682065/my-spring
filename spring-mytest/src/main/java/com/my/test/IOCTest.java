package com.my.test;

import com.my.app.AppConfig;
import com.my.services.IndexService;
import com.my.services.OrderService;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac  =
				new AnnotationConfigApplicationContext(AppConfig.class);

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
