package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EmployeeRepository;
import com.app.entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
private EmployeeRepository employeerepository;

@Override
public List<Employee> findAll() {
	// TODO Auto-generated method stub
	return employeerepository.findAll();
}

@Override
public void delete(Employee emp) {
	employeerepository.delete(emp);
	return;
}

@Override
public Employee findById(int id) {
	// TODO Auto-generated method stub
	return employeerepository.getById(id);
}


}
