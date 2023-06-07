package com.app;

public class Student {
private int prn,m1,m2,m3;
private String name;
public int getPrn() {
	return prn;
}
public void setPrn(int prn) {
	this.prn = prn;
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
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static int total(int m1,int m2,int m3) {
	int sum=m1+m2+m3;
	return sum;
}
public static int percentage(int m1,int m2,int m3) {
	int perc=(m1+m2+m3)/3;
	return perc;
}

}
