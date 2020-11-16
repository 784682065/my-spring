package com.my.services;

import org.springframework.stereotype.Component;

/**
 * @Author: huzp
 * @Description:
 * @Date: Created in  11:25 2020/11/15
 * @param:
 */
@Component
public class JdkIndexService implements JDKIndex{
	@Override
	public void jdkindex() {
		System.out.println("jdkIndex");
	}
}
