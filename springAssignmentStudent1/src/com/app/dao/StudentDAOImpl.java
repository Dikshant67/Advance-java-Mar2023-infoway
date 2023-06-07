package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO{

	@Autowired
	private SessionFactory sessionfactory;


	@Override
	public List<Student> getStudents() {
		Session currentsession =sessionfactory.getCurrentSession();
		Query<Student> thequery = currentsession.createQuery("from Student",Student.class);
		List <Student> student=thequery.getResultList();
		return student;
	}


}
