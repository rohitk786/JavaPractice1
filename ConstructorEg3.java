package com.java;

/*
 * use of this keyword to access instance var
 */
public class ConstructorEg3 {

	public static void main(String[] args) {
		ConstructorTest3 ct = new ConstructorTest3(23);

	}
}

class ConstructorTest3{
	int age = 21;
	ConstructorTest3(int age){
		System.out.println("constructor is invoked..");
		System.out.println("Entered Age is : "+age);
		System.out.println("Age is : "+this.age);
	}
}