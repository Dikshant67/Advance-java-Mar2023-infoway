package com.app.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.springdemo.dao.CustomerDAO;
import com.app.springdemo.entity.Customer;
@Service
public class CustomerServiceImp  implements CustomerService{
//need to inject Customerdao 
	@Autowired
	private CustomerDAO customerdao;
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerdao.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		customerdao.saveCustomer(theCustomer);
		
	}

	@Override
	@Transactional
	public Customer getCustomers(int theId) {
		// TODO Auto-generated method stub
		return customerdao.getCustomers(theId);
	}
	

}
