package com.moon.cxf;

import com.moon.cxf.client.Greeting;
import com.moon.cxf.client.GreetingImplService;

public class CxfClient {
	public static void main(String[] args) {
//		GreetingImplService ss = new GreetingImplService(GreetingImplService.WSDL_LOCATION, new QName("http://server.cxfWebservice.moon.com/", "GreetingImplService"));
//        Greeting port = ss.getGreetingImplPort();  
//        port.greeting("aa");
//        System.out.println("111111"+port.greeting("aa"));
        
        GreetingImplService serviceFactory = new GreetingImplService();  
        Greeting service =   
            serviceFactory.getGreetingImplPort();  
          
        String result = service.greeting("Jaune");  
        System.out.println(result);  

	}
}
