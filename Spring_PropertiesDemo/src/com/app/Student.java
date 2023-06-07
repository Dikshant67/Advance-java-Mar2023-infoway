package com.app;

import org.springframework.beans.factory.annotation.Value;

public class Student {
private String name;
@Value(value="${student.interestedcourse}")
private String interestedcourse;
private String hobby;
private Student() {	}
@Value(value="${student.name}")
public void setName(String name) {
	this.name = name;			
}

public void setInterestedcourse(String interestedcourse) {
	this.interestedcourse = interestedcourse;
}
@Value(value="${student.hobby}")
public void setHobby(String hobby) {
	this.hobby = hobby;
}
@Override
public String toString() {
	return "Student [name=" + name + ", interestedcourse=" + interestedcourse + ", hobby=" + hobby + "]";
}
}
