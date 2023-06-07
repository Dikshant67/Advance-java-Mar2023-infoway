package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.entity.Employee;
import com.app.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
private EmployeeService employeeservice;
@Autowired
public EmployeeController(EmployeeService employeeservice) {
	super();
	this.employeeservice = employeeservice;
}
@GetMapping("/list")
public String listEmployee(Model model)
{
	List<Employee> theEmployee =employeeservice.findAll();
	model.addAttribute("employees",theEmployee);
	return "list-employee";
}
//@PostMapping("/deleteEmployee")
//public String deleteEmployee(@RequestParam("employeeId") int theId)
//{ 
//	employeeservice.delete(theId);
//	return "redirect:/employees/list";
//	
//}
//@GetMapping("/delete/{id}")
//public String deleteUser(@PathVariable("id") long id, Model model) {
//    User user = userRepository.findById(id)
//      .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
//    userRepository.delete(user);
//    return "redirect:/index";
//}
@PostMapping("/deleteEmployee/{id}")
public String deleteEmployee(@PathVariable("id") int id, Model model) {
   Employee emp = employeeservice.findById(id);
    		employeeservice.delete(emp);
	return "list-employee";
}
}
