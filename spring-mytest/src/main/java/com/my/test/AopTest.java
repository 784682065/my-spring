package com.my.test;

import com.my.app.APPConfig;
import com.my.services.AOPIndexService;
import com.my.services.Index;
import com.my.services.IndexService;
import com.my.services.JdkIndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: huzp
 * @Description:
 * @Date: Created in  11:16 2020/10/24
 * @param:
 */
public class AopTest {

	public static void main(String[] args) {


		/**
		 * xxx --- AOPIndexservice -- proxyObject
		 * map.put("indexService",proxy)
		 *
		 *
		 * SpringAOP  ----- 容器初始化的时候就完成了代理
		 *
		 * 哪里完成了代理?------------- singletonObjects.put(beanName, singletonObject)
		 *
		 *  在AbstractBeanFactory的doGetBean的createBean 中 先创建目标对象,在创建代理对象
		 *
		 *
		 */
		AnnotationConfigApplicationContext ac  =
				new AnnotationConfigApplicationContext(APPConfig.class);

		/**
		 * 不是在getBean中完成的代理,而是在初始化中
		 *
		 * 这个方法核心就是map.get("name")
 		 */
//		JdkIndexService bean = (JdkIndexService) ac.getBean("jdkIndexService");
		IndexService bean = ac.getBean(IndexService.class);

//		bean.jdkindex();
		bean.index();

	}

}
