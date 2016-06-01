package com.moon.jdk.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

//使用@WebService注解标注WebServiceServer接口
@WebService
public interface WebServiceServer {
	
	//使用@WebMethod注解标注WebServiceServer接口中的方法
	@WebMethod
	String sayHello(String name);

	@WebMethod
	String save(String name,String pwd);
	
}
