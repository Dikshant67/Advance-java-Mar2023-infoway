package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		
    ApplicationContext context= new ClassPathXmlApplicationContext("com/collection/collectionconfig.xml");
    Student s=(Student)context.getBean("std");
    System.out.println(s.getId());
    System.out.println(s.getName());
    System.out.println(s.getCls());
	}

}
