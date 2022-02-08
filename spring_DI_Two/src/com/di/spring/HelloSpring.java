package com.di.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Laptop laptop=context.getBean("Brand",Laptop.class);
		
		System.out.println(laptop.brandName());
		System.out.println(laptop.service());
		
		context.close();
		
	}

}
