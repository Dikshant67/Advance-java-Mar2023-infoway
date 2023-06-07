package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("humanObject")
	private Heart heart;
	public Human() {
		System.out.println("Human Default Constructor");
	}
	
	
	public Human(Heart heart) {
		super();
		System.out.println("In the paramaterized constructor of Human");
		this.heart = heart;
	}


	public Heart getHeart() {
		
		System.out.println("In the getter of human");
		return heart;
	}
	public void setHeart(Heart heart) {
		System.out.println("In the setter of human");
		this.heart = heart;
		
	}


	@Override
	public String toString() {
		return "Human [heart=" + heart + "]";
	}
	
	

}
