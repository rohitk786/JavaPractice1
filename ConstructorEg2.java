package com.java;

/*
 * Use of paramterized and parameterless constructor
 * use of this to call other constructor
 */
public class ConstructorEg2 {

	public static void main(String[] args) {
		ConstructorTest2 ct = new ConstructorTest2(20,"xyz");
		ConstructorTest2 ct2 = new ConstructorTest2();
	}
}

class ConstructorTest2{
	int age;
	String name;
	ConstructorTest2(){
		this(26, "Rohit");
		System.out.println("Constructor1 is invoked....");
	}
	ConstructorTest2(int age,String name){
		System.out.println("Parameterized constructor is invoked..");
		System.out.println("Age is : "+age);
		System.out.println("Name is : "+name);
	}
}