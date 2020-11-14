package com.my.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Author: huzp
 * @Description:
 * @Date: Created in  17:28 2020/10/12
 * @param:
 */
@Component
public class UserService {
	@Value(value = "CodeTiger")
	private String name;

	@Autowired
	IndexService indexService;

	public UserService() {
		System.out.println("im userservice");
	}


	public IndexService getIndexService() {
		return indexService;
	}

	public void getName(){
		System.out.println("my name is "+name);
	}

	//生命周期 初始化回调方法
	@PostConstruct
	public void aa() {
		System.out.println("aaaaaaaa");
	}
}
