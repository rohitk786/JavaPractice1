package com.java;

/*
 * Constructor Overloading.....
 */
public class ConstructorEg4 {

	public static void main(String[] args) {
		ConstructorTest4 ct1 = new ConstructorTest4("Rohit");
		ConstructorTest4 ct2 = new ConstructorTest4("Rohit",25);
		ConstructorTest4 ct3 = new ConstructorTest4(12345);

	}
}

class ConstructorTest4{
	ConstructorTest4(String name) 
    { 
        System.out.println("Constructor with one argument - String : " + name); 
    } 
  
    // constructor with two arguments 
	ConstructorTest4(String name, int age) 
    { 
  
        System.out.println("Constructor with two arguments String and Integer : " + name + " "+ age); 
  
    } 
  
    // Constructor with one argument but with different type
	ConstructorTest4(long id) 
    { 
        System.out.println("Constructor with one argument : " + 
                                            "Long : " + id); 
    } 
}