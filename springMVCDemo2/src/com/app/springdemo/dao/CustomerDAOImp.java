package com.app.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.springdemo.entity.Customer;

@Repository
public class CustomerDAOImp implements CustomerDAO {
	// need to inject session factory
	@Autowired
	private SessionFactory sessionfactory;

	@Override
	public List<Customer> getCustomers() {
		// Get the Hibernate session
		Session currentsession = sessionfactory.getCurrentSession();
		// create a query to sort by lastname
		Query<Customer> theQuery = currentsession.createQuery("from Customer", Customer.class);
		// execute query and get result
		List<Customer> customer = theQuery.getResultList();
		// return the result

		return customer;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		// Get the Hibernate session
		Session currentsession = sessionfactory.getCurrentSession();
		currentsession.saveOrUpdate(theCustomer);
	}

	@Override
	public Customer getCustomers(int theId) {
		// Get the Hibernate session
		Session currentsession = sessionfactory.getCurrentSession();
		// retrieve/read from database using primary key
		Customer theCustomer = currentsession.get(Customer.class, theId);

		return theCustomer;
	}

}
