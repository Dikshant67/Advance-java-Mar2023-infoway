package com.app.springdemo.rest;




import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.springdemo.entity.Student;


@RestController
@RequestMapping("/api")
public class StudentRestController {
 List<Student> theStudents;
 @PostConstruct 
 public void loadData()
{
 theStudents = new ArrayList<Student>();
	theStudents.add(new Student(1,"rahul","pawar",true));
	theStudents.add(new Student(2,"aishwarya","patil",false));
	theStudents.add(new Student(3,"aishwarya","patil",false));
	
}
 @GetMapping("students")
 public List<Student> getStudents()
 {
	 return theStudents;
	 
 }
 @GetMapping("/students/{studentID}")
 public Student getStudent(@PathVariable int studentID) {
	 return theStudents.get(studentID);
 }
 
}
