package com.moon.cxfWebservice.server;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface Greeting {
	public String greeting(@WebParam(name="username")String userName);
}
