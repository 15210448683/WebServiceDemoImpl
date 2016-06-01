package com.moon.client;

import com.moon.jdk.server.WebServiceServerImpl;
import com.moon.jdk.server.WebServiceServerImplService;

public class WSClient {
	public static void main(String[] args) {
        //创建一个用于产生WebServiceImpl实例的工厂，WebServiceImplService类是wsimport工具生成的
		WebServiceServerImplService factory = new WebServiceServerImplService();
        //通过工厂生成一个WebServiceImpl实例，WebServiceImpl是wsimport工具生成的
		WebServiceServerImpl wsImpl = factory.getWebServiceServerImplPort();
        //调用WebService的sayHello方法
        String resResult = wsImpl.sayHello("孤傲苍狼");
        System.out.println("调用WebService的sayHello方法返回的结果是："+resResult);
        System.out.println("---------------------------------------------------");
        //调用WebService的save方法
        resResult = wsImpl.save("孤傲苍狼","123");
        System.out.println("调用WebService的save方法返回的结果是："+resResult);
    }

}
