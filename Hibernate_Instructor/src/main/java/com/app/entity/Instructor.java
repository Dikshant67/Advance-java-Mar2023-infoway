package com.app.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="intructor")
public class Instructor implements Serializable{
@Id 
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="id")
private int id;
@Column(name="first_name")
private String firstName;
@Column(name="last_name")
private String lastname;
@Column(name="email")
private String email;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn 
}
