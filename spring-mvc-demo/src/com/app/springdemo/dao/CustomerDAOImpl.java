package com.app.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {
		Session currentsession= sessionFactory.getCurrentSession();
		Query<Customer> theQuery=currentsession.createQuery("from Customer",Customer.class);
		List<Customer>customers=theQuery.getResultList();

		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theCustomer);

	}

	@Override
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory.getCurrentSession();
		Customer theCustomer=currentSession.get(Customer.class,theId);
		//		currentSession.delete(theCustomer);
		return theCustomer;
	}

	@Override
	public Customer deleteCustomer(int theId) {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory.getCurrentSession();
		Customer theCustomer=currentSession.get(Customer.class,theId);
		currentSession.delete(theCustomer);
		return null;

	}	
}
