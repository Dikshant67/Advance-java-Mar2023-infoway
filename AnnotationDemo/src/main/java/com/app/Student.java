package com.app;

import java.io.Serializable;

import javax.persistence.*;
import javax.persistence.Table;



@Table(name="student123")
@Entity
public class Student implements Serializable{
	@Id
	@Column(name="rollno")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rn;
	@Column
	private String firstname;
	@Column(name="lname")
	private String lastName;
	public Student() {}
	public Student(String firstname, String lastName) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
	}
	public int getRn() {
		return rn;
	}
	public void setRn(int rn) {
		this.rn = rn;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Student [rn=" + rn + ", firstname=" + firstname + ", lastName=" + lastName + "]";
	}
	
	
	
	
	

}
