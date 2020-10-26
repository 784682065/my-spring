package com.my.services;

import org.springframework.stereotype.Service;

/**
 * @Author: huzp
 * @Description:
 * @Date: Created in  11:16 2020/10/24
 * @param:
 */
@Service
public class AOPIndexService implements Index {



	public void aopIndex(){

	}

	@Override
	public void index() {
		System.out.println(2333);
	}
}
