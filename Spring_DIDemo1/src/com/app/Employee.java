package com.app;

public class Employee {
private int id;
private String name;
private float salary;
private Date date;
        public Employee() 
     {
	    System.out.println("Default Contructor of Employee");
     }

   public Employee(int id, String name, float salary)
   {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;

   }

public Employee(int id, String name,Date d) {
	super();
	this.id = id;
	this.name = name;
    this.date =d;     

	
}


public Employee(int id, String name, float salary, Date date) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.date = date;
	System.out.println("In the paramaterized contructor of Employees");
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", date=" + date + "]";
}



}
