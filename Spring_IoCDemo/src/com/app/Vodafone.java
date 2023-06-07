package com.app;

public class Vodafone implements Sim {

	
	public Vodafone() {
		System.out.println("Vodafone's  Default Contructor");
	}
	@Override
	public void calling() {
		System.out.println("Calling Using Vodafone Sim");
		
	}

	@Override
	public void browsing() {
	System.out.println("Browsing using Vodafone Sim");
		
	}

}
