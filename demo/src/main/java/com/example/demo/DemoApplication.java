package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.config.AppConfig;

@SpringBootApplication 
public class DemoApplication  {

	public static void main(String[] args) {
		Class[] configClasses = {DemoApplication.class, AppConfig.class};
		SpringApplication.run(configClasses, args);
	}
	
	
}
