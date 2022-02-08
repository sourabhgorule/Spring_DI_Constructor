package com.di.spring;

public class HP implements Laptop {

	private LaptopService laptopService;
	
	public HP(LaptopService service) {
		laptopService=service;
	}
	
	@Override
	public String brandName() {
		// TODO Auto-generated method stub
		return "Hey,HP here";
	}

	@Override
	public String service() {
		// TODO Auto-generated method stub
		return laptopService.getService();
	}

}
