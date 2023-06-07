package com.app;

public class Airtel implements Sim{

	public Airtel() {
		System.out.println("Airtel's Default Contructor");
	}
	@Override
	public void calling() {
           System.out.println("Calling using Airtel Sim");
		
	}

	@Override
	public void browsing() {
           System.out.println("Browsing using Airtel Sim");
		
	}

}
