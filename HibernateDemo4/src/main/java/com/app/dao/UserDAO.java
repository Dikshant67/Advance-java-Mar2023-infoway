package com.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.bean.User;

public class UserDAO {
public static int saveUser(User u)
{
	int i=0;
 SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).buildSessionFactory();
 Session session = factory.openSession();
 session.beginTransaction();
 i=(Integer)session.save(u);
 session.getTransaction().commit();
 session.close();
 factory.close();
return i;
 
}
}
