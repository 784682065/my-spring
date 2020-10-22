package com.my.test;

import com.my.app.AppConfig;
import com.my.services.IndexService;
import com.my.services.TestService;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: huzp
 * @Description:
 * @Date: Created in  17:04 2020/10/12
 * @param:
 */
public class Test {
	public static void main(String[] args) {
		/**
		 * 三级缓存
		 *
		 * 1. singletonObjects  单例对象池
		 *
		 * 2. singletonFactories 二级缓存工厂 : 二级缓存的作用是可以提前把AOP功能完成
		 *
		 * 3. earlySingletonObjects 三级缓存对象
		 *
		 * 二级缓存和三级缓存 放的是半成品
		 * 单例池才是放的bean
		 * 只有完整的经历一个spring的周期  java对象变成 bean
		 */
		AnnotationConfigApplicationContext ac  =
				new AnnotationConfigApplicationContext(AppConfig.class);

		/**
		 * 		// 手动调用spring
		 * 		ac.register(AppConfig.class);
		 * 		//关闭循环依赖
		 * 		AbstractAutowireCapableBeanFactory beanFactory = (AbstractAutowireCapableBeanFactory) ac.getBeanFactory();
		 * 		beanFactory.setAllowCircularReferences(false);
		 * 		ac.refresh();
		 */

//		System.out.println(ac.getBean("userService"));
//		ac.getBean(IndexService.class).getUserService();
		ac.getBean(TestService.class);
	}
}
