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
	@Autowired
	private CustomerService customerservice;

	@GetMapping("/list")
	public String listcustomer(Model theModel)
	{
		List<Customer> thecustomer= customerservice.getCustomer();
		theModel.addAttribute("customers", thecustomer);
		return "list-customer";
	}
	@GetMapping("/ShowFormForAdd")
	public String ShowFormForAdd(Model theModel)
	{
		Customer theCustomer=new Customer();
		theModel.addAttribute("customer",theCustomer);
		return "customer-form";
	}
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer)
	{
		customerservice.saveCustomer(theCustomer);
		return "redirect:/customer/list";
	}

	@PostMapping("/ShowFormForUpdate")
	public String  ShowFormForUpdate(@RequestParam("customerId") int theId,Model theModel)
	{
		Customer theCustomer=customerservice.getCustomer(theId);
		theModel.addAttribute("customer", theCustomer);
		return "customer-form";
		//	return "redirect:/customer/list";

	}
	@PostMapping("/DeleteCustomer")
	public String  DeleteCustomer(@RequestParam("customerId") int theId,Model theModel)
	{
		customerservice.deleteCustomer(theId);
		//theModel.addAttribute("customer", theCustomer);
		return "redirect:/customer/list";
	}
}