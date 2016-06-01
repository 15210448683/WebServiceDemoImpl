package com.moon.listener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.xml.ws.Endpoint;

import com.moon.jdk.server.WebServiceServerImpl;

//使用Servlet3.0提供的@WebListener注解将实现了ServletContextListener接口的WebServicePublishListener类标注为一个Listener
@WebListener
public class WebServicePublishListener  implements ServletContextListener{

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	 public void contextInitialized(ServletContextEvent sce) {
	    //WebService的发布地址
	     String address = "http://127.0.0.1:8089/WS_Server/WebService";
	     //发布WebService，WebServiceImpl类是WebServie接口的具体实现类
	     Endpoint.publish(address , new WebServiceServerImpl());
	     System.out.println("使用WebServicePublishListener发布webservice成功!");
	 }

}
