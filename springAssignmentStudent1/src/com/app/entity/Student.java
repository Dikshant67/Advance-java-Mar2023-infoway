package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Controller;
@Entity
@Controller
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="prn")
	private int prn;
	@Column(name="name")
	private String name;
	@Column(name="m1")
	private int m1;
	@Column(name="m2")
	private int m2;
	@Column(name="m3")
	private int m3;

	public Student() {
		super();
	}

	public Student(String name, int m1, int m2, int m3) {
		super();
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	public int getPrn() {
		return prn;
	}

	public void setPrn(int prn) {
		this.prn = prn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}


}
