package com.app;

public class Date {
private int dd,mm,yy;
public Date() {
	System.out.println("Date Default Constructor");
}
public Date(int dd, int mm, int yy) {
	super();
	this.dd = dd;
	this.mm = mm;
	this.yy = yy;
}



@Override
public String toString() {
	return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	
	
}

}
