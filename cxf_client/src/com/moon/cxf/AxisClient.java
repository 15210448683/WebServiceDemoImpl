package com.moon.cxf;

import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;
/**
 * 使用axis调用cxf发布的webservice接口
 * @author moon
 *
 */
public class AxisClient {
	public static void main(String[] args) throws ServiceException, RemoteException {
//		Service service = new Service();
//		Call call = (Call) service.createCall();
//		call.setTargetEndpointAddress("http://localhost:8080/cfxWSServer/webservice/Greeting");
//		call.setOperationName("greeting");
//		call.addParameter("userName", XMLType.XSD_STRING, ParameterMode.IN);   
//		call.setReturnType(XMLType.XSD_STRING);
//		System.out.println(call.invoke(new Object[] { "harold!" }));
		 try {  
			  
             String endpoint = " http://localhost:8080/cfxWSServer/webservice/Greeting";  
             // 调用过程  
             Service service = new Service();  

             Call call = (Call) service.createCall();  

             call.setTargetEndpointAddress(new java.net.URL(endpoint));  

             call.setOperationName(new QName("http://server.cxfWebservice.moon.com/","greeting"));// WSDL里面描述的操作名称  

             call.addParameter("username",  
                             org.apache.axis.encoding.XMLType.XSD_STRING,  
                             javax.xml.rpc.ParameterMode.IN);// 操作的参数  

             call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);// 设置返回类型  

             call.setUseSOAPAction(true);  

             // 给方法传递参数，并且调用方法  
             String temp = "good";  
             Object[] obj = new Object[] { temp };  
             String result = (String) call.invoke(obj);  

             System.out.println("Result is : " + result);  
     } catch (Exception e) {  
             e.printStackTrace();  
     }  
	}

}
