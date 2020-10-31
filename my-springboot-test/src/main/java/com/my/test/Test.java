package com.my.test;

import com.my.app.SpringApplication;
import com.my.web.IndexServlet;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Test {

	public static void main(String[] args) throws LifecycleException {
//		Tomcat tomcat = new Tomcat();
//		tomcat.setPort(9070);
//		tomcat.start();
//
//		IndexServlet indexServlet = new IndexServlet();
//		// /Users/hziee/Desktop
//		Context context = tomcat.addWebapp("/boot", "/Users/hziee/Desktop");
//
//		tomcat.addServlet("/boot","index",indexServlet);
//
//		context.addServletMappingDecoded("/index.do","index");
//
//		tomcat.getServer().await();
		SpringApplication.run();

	}
}
