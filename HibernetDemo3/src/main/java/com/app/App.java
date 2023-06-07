package com.app;


import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App {
public static void main(String[] args) {

	//Step 1.get Session Factory
	SessionFactory factory =new Configuration().configure().buildSessionFactory();
	
	//Step 2.Get Session
	Session session1=factory.openSession();
	//Step 3. Get Transaction Begin
	session1.beginTransaction();
	
	
	 //1.Inserting the values
	
    /*
	Student s=new Student("dikshant","wagh");
	int i=(Integer)session1.save(s);
    System.out.println(i);
   */
	
	//2.Getting the values
	/*
	int id=2;
	Student s=session1.get(Student.class, id);
	System.out.println(s);
    */
	//3.Updating the values
	/*
	Student s = session1.get(Student.class,1);
	System.out.println(s);
s.setFirstName("Umesh");
s.setLastName("Pawar");
	*/
	
	//4.Deleting the values
	/*
	Student s = session1.get(Student.class,1);
	System.out.println(s);
	session1.delete(s);
	
	//5.To Get all the Records
	*/Student s = session1.get(Student.class,1);
	Query query =session1.createQuery("from Student");
	List <Student> l=query.getResultList();
	System.out.println(l);
	session1.getTransaction().commit();
	session1.close();
	
}
}
