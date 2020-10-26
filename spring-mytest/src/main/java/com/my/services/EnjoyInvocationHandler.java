package com.my.services;

import org.springframework.validation.ObjectError;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: huzp
 * @Description:
 * @Date: Created in  10:54 2020/10/26
 * @param:
 */
public class EnjoyInvocationHandler implements InvocationHandler {

	Object o ;

	public EnjoyInvocationHandler(Object o) {
		this.o = o;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("enjoy before");
		return method.invoke(o);
	}
}
