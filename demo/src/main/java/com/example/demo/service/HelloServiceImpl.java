package com.example.demo.service;

import javax.ws.rs.Path;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloServiceImpl implements HelloService{

	private static Logger log = LoggerFactory.getLogger(HelloServiceImpl.class);
	@Override
	public String sayHello(String name) {
		log.debug("Hello " + name + "! Greetings from Pivotal.");
		return "Hello " + name + "! Greetings from Pivotal.";
	}

}
