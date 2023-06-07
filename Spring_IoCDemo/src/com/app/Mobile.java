package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
public static void main(String[] args) {
	
	/*
	Vodafone voda=new Vodafone();
	voda.browsing();
	voda.calling();
	*/
	
	/*
	Airtel air=new Airtel();
	air.calling();
	air.browsing();
	*/
	
	/*	Sim sim= new Airtel();
	sim.browsing();
	sim.calling();
     */
 
	/*
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	Airtel v = context.getBean(Airtel.class,"sim");
	v.browsing();
	v.calling();
	*/
	/*
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	Vodafone v= (Vodafone)context.getBean("sim");
	v.browsing();
	v.calling();

	 */
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Sim s=context.getBean(Sim.class,"sim1");
	s.browsing();
	s.calling();
	
	
	
	
}
}
