package com.my.app;

import com.my.web.IndexServlet;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class SpringApplication {

	public static void run() throws LifecycleException {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(9070);

		//重要： 无论是什么项目 只要添加了这行代码，tomcat都会将这个项目作为web项目
		tomcat.addWebapp("/boot", "/Users/hziee/Desktop");

		tomcat.start();


		tomcat.getServer().await();

	}
}
