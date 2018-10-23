package com.example.demo.service;

import javax.ws.rs.Path;


public class HelloServiceImpl implements HelloService{

	@Override
	public String sayHello(String name) {
		return "Hello " + name + ". It's a beautiful day!";
	}

}
