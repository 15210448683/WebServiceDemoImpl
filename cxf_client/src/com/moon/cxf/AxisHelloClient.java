package com.moon.cxf;

import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

public class AxisHelloClient {
	public static void main(String[] args) throws ServiceException, RemoteException {
		Service service = new Service();
		Call call = (Call) service.createCall();
		call.setTargetEndpointAddress("http://localhost:8080/cfxWSServer/webservice/HelloWorld");
		call.setOperationName(new QName("http://impl.service.cxf.cmc.cigna.com/","sayHello"));
		call.addParameter("name", XMLType.XSD_STRING, ParameterMode.IN);
		call.addParameter("sex", XMLType.XSD_STRING, ParameterMode.IN);
		call.setReturnType(XMLType.XSD_STRING);
		System.out.println(call.invoke(new Object[] { "harold!","l" }));
	}

}
