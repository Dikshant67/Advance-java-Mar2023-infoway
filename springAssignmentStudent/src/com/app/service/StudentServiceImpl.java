package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.StudentDAO;
import com.app.entity.Student;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDAO studentdao;

	@Override
	@Transactional
	public List<Student> getStudents() {

		return studentdao.getStudents();
	}

}
