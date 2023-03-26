package com.mac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Operation operation =  context.getBean("opBean", Operation.class);
		operation.msg();
		operation.m();
		operation.k();
	}
}
