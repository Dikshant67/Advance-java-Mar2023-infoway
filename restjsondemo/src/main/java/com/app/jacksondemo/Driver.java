package com.app.jacksondemo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {
public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
	//create a object mapper 
	ObjectMapper mapper = new ObjectMapper();
	//read json from file and map/convert to POJO
	Student mystudent = mapper.readValue(new File("data/sample-lite.json"), Student.class);
	
	System.out.println("FIRST NAME =  "+ mystudent.getFirstName());
	System.out.println("LAST NAME =  "+ mystudent.getLastName());
}
}
