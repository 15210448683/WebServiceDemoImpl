package com.moon.cxfWebservice.server;

import java.util.Calendar;

import javax.jws.WebService;

@WebService(endpointInterface="com.moon.cxfWebservice.server.Greeting")
public class GreetingImpl implements Greeting{

	public String greeting(String userName) {
		return "Hello " + userName + ", currentTime is "
			    + Calendar.getInstance().getTime();
	}

}
