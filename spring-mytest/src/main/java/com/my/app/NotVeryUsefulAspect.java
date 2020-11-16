package com.my.app;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author: huzp
 * @Description:
 * @Date: Created in  9:49 2020/10/16
 * @param:
 */
@Component
@Aspect
public class NotVeryUsefulAspect {

	/**
	 * spring 生命周期 大概
	 *
	 * 1. new  在instance = crreateBeaninstance(beanName,mdb,args) 里面
	 * 1.5. 判断循环依赖,放入二级缓存 "工厂" 中
	 * 2. 注入
	 * 3. init生命周期的初始化方法
	 * 4. 代理aop
	 * 5. put singletonObject
	 *
	 *
	 * 如果一个对象被AOP 作用了,相当于改变了这个对象, 用了动态代理 proxy
	 */

	/**
	 * 切点是一堆连接点的集合
	 */
	@Pointcut("execution(* com.my.services..*(..))")
	public void pointCut() {
	}


	@Before("pointCut()")   // potinCut 要加()
	public void before() {
		System.out.println("-------------before0--------------------");
	}

	@After("pointCut()")   // potinCut 要加()
	public void after() {
		System.out.println("-------------after0--------------------");
	}
}
