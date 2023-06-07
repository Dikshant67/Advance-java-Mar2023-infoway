package com.app.springdemo.entity;
public class Student {
private int id;
private String firstName;
private String LastName;
private boolean active;

public Student(int id, String firstName, String lastName, boolean active) {
	super();
	this.id = id;
	this.firstName = firstName;
	LastName = lastName;
	this.active = active;
}

public Student(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	LastName = lastName;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public boolean isActive() {
	return active;
}
public void setActive(boolean active) {
	this.active = active;
}

}
