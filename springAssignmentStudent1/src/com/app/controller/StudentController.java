package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.entity.Student;
import com.app.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentservice;

	@GetMapping("/list")
	public String listStudent(Model themodel) {
		List<Student> thestudent=studentservice.getStudents();
		themodel.addAttribute("student",thestudent);
		return "list-students";
	}
	@GetMapping("/ShowFormForAdd")
	public String addStudent(Model theModel) {
		Student student= new Student();
		theModel.addAttribute("student",student);
		return "student-form";
	}
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("customer") Student theStudent)
	{
		studentservice.saveStudent(theStudent);
		return "redirect:/student/list";
	}
}
