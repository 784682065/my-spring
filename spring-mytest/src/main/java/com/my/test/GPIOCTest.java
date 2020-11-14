package com.my.test;

import com.my.app.APPConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: huzp
 * @Description:
 * @Date: Created in  11:06 2020/11/9
 * @param:
 */
public class GPIOCTest {
	public static void main(String[] args) {

		/**
		 * 定位 ---> 加载 --->注册
		 */

		ApplicationContext app = new ClassPathXmlApplicationContext(
				"application.xml"
		);

		//todo 自己完成对Annation的解析的源码阅读
		AnnotationConfigApplicationContext ac  =
				new AnnotationConfigApplicationContext(APPConfig.class);



	}
}
