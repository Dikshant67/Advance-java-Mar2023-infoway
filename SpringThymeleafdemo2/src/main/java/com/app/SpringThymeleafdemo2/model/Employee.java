package com.app.SpringThymeleafdemo2.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name="employee")

public class Employee {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
@Column(name="first_name")
private int firstName;
@Column(name="last_name")
private int lastName;
@Column(name="email")
private int email;


}
