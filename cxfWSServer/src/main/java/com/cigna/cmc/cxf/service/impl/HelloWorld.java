package com.cigna.cmc.cxf.service.impl;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface HelloWorld {
@WebResult(name = "String")
String sayHello(@WebParam(name = "name") String name,
 @WebParam(name = "sex") String sex);
  void test();
}