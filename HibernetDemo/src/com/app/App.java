package com.app;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class App {
public static void main(String[] args) {
	/*
	
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
	SessionFactory factor =meta.getSessionFactoryBuilder().build(); 
	Session session =factor.openSession();
	//org.hibernate.transaction t =session.beginTransaction();
	Transaction t=session.beginTransaction();
	//save Employee e
	Employee e=new Employee();
	e.setId(333);
	e.setFirstname("Rahul");
	e.setLastname("Pawar");
	e.setEmail("rahul@gmail.com");
	session.save(e);
	t.commit();
	System.out.println("Success");
	
	*/
	//Step 1.get Session Factory
	SessionFactory factory =new Configuration().configure().buildSessionFactory();
	//Step 2.Get Session
	Session session1=factory.openSession();
	//Step 3. Get Transaction Begin
	Transaction t=session1.beginTransaction();
	Employee e=new Employee();
	e.setId(333);
	e.setFirstname("DIKSHANT");
	e.setLastname("WAGH");
	e.setEmail("abc@gmail.com");
	int i=(int)session1.save(e);
	System.out.println(i);
	t.commit();
	session1.close();
	
}
}
