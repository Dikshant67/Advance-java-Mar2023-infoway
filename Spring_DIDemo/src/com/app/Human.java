package com.app;

public class Human {
	private Heart heart ;
	public Human()
	{
		System.out.println("Human Default Constructor");
	}
	public Human(Heart heart) {	
		super();
		this.heart = heart;
		System.out.println("Human Paramaterized Contructor");
	}
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("In the Setter of Human");
	}
   public void pumping() {
	   if(heart!=null) {
		   heart.pump();
	   }
	   else {
		   System.out.println("You are Dead");
	   }
   }
	
}
