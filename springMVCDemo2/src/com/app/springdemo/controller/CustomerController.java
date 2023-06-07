package com.app.springdemo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.springdemo.entity.Customer;
import com.app.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	//need to inject customer service
	@Autowired
	private CustomerService customerservice;

	@GetMapping("/list")
	public String listCustomer(Model theModel)
	{
		//get customers from the service
		List <Customer> theCustomer = customerservice.getCustomers();
		//add the customers to the model 
		theModel.addAttribute("customer", theCustomer);
		return "list-customer";

	} 
	@GetMapping("/showformforadd")
	public String showformforadd(Model theModel)
	{
		//create model attribute to bind form data
		Customer theCustomer = new Customer();
		theModel.addAttribute("customer",theCustomer);
		return "customer-form";


	}
	@PostMapping("/savecustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer)
	{
		//Save the Customer using service
		customerservice.saveCustomer(theCustomer);
		return "redirect:/customer/list";
	}
	@GetMapping("/showformforUpdate")
	public String showformUpdate(@RequestParam("customerId") int theId, Model theModel) {
		//get the customer from our service
		Customer theCustomer = customerservice.getCustomers(theId);
		theModel.addAttribute("customer",theCustomer);
		return "customer-form";

	}
}
