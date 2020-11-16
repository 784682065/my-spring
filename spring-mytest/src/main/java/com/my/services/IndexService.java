package com.my.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: huzp
 * @Description:
 * @Date: Created in  16:35 2020/10/15
 * @param:
 */
@Component
public class IndexService {

//	@Autowired
//	UserService userService;

	public IndexService() {
		System.out.println("im index");
	}

//	public UserService getUserService() {
//
//		System.out.println("service method");
//		return userService;
//	}

	/**
	 *  AOP -----  对index 方法做一个增强
	 */
	public  void index(){
		System.out.println("23333");
	}





}
