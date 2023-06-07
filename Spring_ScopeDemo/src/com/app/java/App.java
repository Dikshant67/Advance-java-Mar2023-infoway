package com.app.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			Coach theCoach = context.getBean("mycoach",Coach.class);
			Coach alphaCoach= context.getBean("mycoach",Coach.class);
			boolean result = (theCoach==alphaCoach);
			System.out.println("Result = "+ result);
			System.out.println("Memory Location for theCoach"+theCoach);
			System.out.println("Memory Location for alphaCoach"+alphaCoach);
			
}
}
