package com.app;

public class Student {
private int id;
private String firstname,lastname;
public Student(int id, String firstname, String lastname) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
}
public Student(String firstname, String lastname) {
	super();

	this.firstname = firstname;
	this.lastname = lastname;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}

}
