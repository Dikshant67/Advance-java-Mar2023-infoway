package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.entity.Employee;

public interface EmployeeService {
 public List<Employee> findAll();
 public void delete(Employee emp);
 public Employee findById(int id);
 
}
