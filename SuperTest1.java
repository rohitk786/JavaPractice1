package com.java;

class Demo1{  
	String color = "white";  
}  

public class SuperTest1 extends Demo1{  
	String color="black";  
	void printColor(){  
		System.out.println(color);//prints color of Test class  
		System.out.println(super.color);//prints color of Demo class  
	}  
}  