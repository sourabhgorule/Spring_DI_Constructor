package com.di.spring;

public class Dell implements Laptop {

	private LaptopService laptopService;
	
	public Dell(LaptopService service)
	{
		laptopService=service;
	}
	
	@Override
	public String brandName() {
		// TODO Auto-generated method stub
		return "Hey, Dell Here..";
	}

	@Override
	public String service() {
		// TODO Auto-generated method stub
		return laptopService.getService();
	}

}
