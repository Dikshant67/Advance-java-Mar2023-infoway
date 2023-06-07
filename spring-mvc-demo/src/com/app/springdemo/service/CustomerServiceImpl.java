package com.app.springdemo.service;

import java.util.List;

import javax.swing.text.DefaultEditorKit.CutAction;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.springdemo.dao.CustomerDAO;
import com.app.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDAO customerDAO;

	@Override
	@Transactional
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer thecustomer) {
		// TODO Auto-generated method stub
		customerDAO.saveCustomer(thecustomer);
		
	}

	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomer(theId);
	}

	@Override
	@Transactional
	public Customer deleteCustomer(int theId) {
		// TODO Auto-generated method stub
		
		return customerDAO.deleteCustomer(theId);
	}

	

	
	
}
