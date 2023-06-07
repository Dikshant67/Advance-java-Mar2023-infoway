package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
  SessionFactory factory=new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
  Session session =factory.openSession();
  session.beginTransaction();
  Student s=new Student("vishal","patil");
  int i=(Integer)session.save(s);
  System.out.println(i);
  session.getTransaction().commit();
  session.close();
    }
}
