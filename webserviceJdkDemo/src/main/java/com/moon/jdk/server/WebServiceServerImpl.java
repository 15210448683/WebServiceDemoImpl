package com.moon.jdk.server;

import javax.jws.WebService;

//使用@WebService注解标注WebServiceI接口的实现类WebServiceImpl
@WebService
public class WebServiceServerImpl implements WebServiceServer{

	public String sayHello(String name) {
		System.out.println("WebService sayHello "+name);
		return "sayHello "+name;
	}

	public String save(String name, String pwd) {
		System.out.println("WebService save "+name+"， "+pwd);
		return "save Success";
	}
	

}
