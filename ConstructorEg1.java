package com.java;

/*
 * use of default constructor
 */
public class ConstructorEg1 {

	public static void main(String[] args) {
		ConstructorTest1 ct = new ConstructorTest1();
		System.out.println("Age : "+ ct.age);
		System.out.println("Name : "+ct.name);

	}

}

class ConstructorTest1{
	int age = 25;
	String name = "Rohit";
}
