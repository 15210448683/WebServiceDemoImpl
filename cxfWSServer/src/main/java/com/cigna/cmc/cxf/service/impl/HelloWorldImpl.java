package com.cigna.cmc.cxf.service.impl;

import javax.jws.WebService;

@WebService
public class HelloWorldImpl implements HelloWorld {
	public String sayHello(String name, String sex) {
		if ("F".equals(sex)) {
			return "Hello," + name + "小姐";
		}
		if ("M".equals(sex)) {
			return "Hello," + name + "先生";
		} else {
			return "Hello," + name;
		}
	}

	public void test() {
		System.out.println("only test for privilege!");
	}
}
