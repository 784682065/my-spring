package com.my.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author: huzp
 * @Description:
 * @Date: Created in  11:16 2020/10/24
 * @param:
 */
@Component
public class AOPIndexService implements Index {



	@Override
	public void index() {
		System.out.println(2333);
	}
}
