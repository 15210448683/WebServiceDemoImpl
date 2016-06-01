package com.moon.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.xml.ws.Endpoint;

import com.moon.jdk.server.WebServiceServerImpl;

/**
 * @author gacl
 * 用于发布WebService的Servlet
 */
//使用Servlet3.0提供的@WebServlet注解将继承HttpServlet类的普通Java类标注为一个Servlet
//将value属性设置为空字符串，这样WebServicePublishServlet就不提供对外访问的路径
//loadOnStartup属性设置WebServicePublishServlet的初始化时机
@WebServlet(value="",loadOnStartup=0)
public class WebServicePublishServlet extends HttpServlet {

    /* (non-Javadoc)
     * @see javax.servlet.GenericServlet#init()
     * 在WebServicePublishServlet初始化时发布WebService
     */
    public void init() throws ServletException {
        //WebService的发布地址
        String address = "http://127.0.0.1:8888/WebService";
        //发布WebService，WebServiceImpl类是WebServie接口的具体实现类
        Endpoint.publish(address , new WebServiceServerImpl());
        System.out.println("使用WebServicePublishServlet发布webservice成功!");
    }
}