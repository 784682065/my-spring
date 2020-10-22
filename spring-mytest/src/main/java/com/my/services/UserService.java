package com.my.services;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	IndexService indexService;

	public UserService() {
		System.out.println("im userservice");
	}


	public IndexService getIndexService() {
		return indexService;
	}

	//生命周期 初始化回调方法
	@PostConstruct
	public void aa() {
		System.out.println("aaaaaaaa");
	}
}
