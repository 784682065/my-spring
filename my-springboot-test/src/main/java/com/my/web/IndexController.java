package com.my.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("index1.do")
	public void index(){
		System.out.println("--------indexController---------");
	}
}
