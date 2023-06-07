package com.app;

public class Heart {
private String nameOfAnimal;
private String noOfHeart;
public String getNameOfAnimal() {
	return nameOfAnimal;
}
public void setNameOfAnimal(String nameOfAnimal) {
	this.nameOfAnimal = nameOfAnimal;
}
public String getNoOfHeart() {
	return noOfHeart;
}
public void setNoOfHeart(String noOfHeart) {
	this.noOfHeart = noOfHeart;
}
public void pump() {
	System.out.println("Your Heart is Pumping");
	System.out.println("You are alive");
		
	}
@Override
public String toString() {
	return "Heart [nameOfAnimal=" + nameOfAnimal + ", noOfHeart=" + noOfHeart + "]";
}


}

