package com.cts.services;

public class GreetServiceEnhancedImpl implements GreetService{
	private String greeting;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String greet(String userName) {
		// TODO Auto-generated method stub
		return greeting+userName;
	}

	public GreetServiceEnhancedImpl(String greeting) {
		super();
		this.greeting = greeting;
	}

//	public GreetServiceEnhancedImpl() {
//		super();
//	}
	
	

}
