package com.app.springdemo.service;

import java.util.List;

import com.app.springdemo.entity.Customer;

public interface CustomerService {

	public List<Customer>getCustomer();
	public void saveCustomer(Customer thecustomer);
	public Customer getCustomer(int theId);
	public Customer deleteCustomer(int theId);
}
