package com.java;

/*
 * overloading by different no of args
 * compile-time polymorphism
 */
public class MethodOverloading {

	 private static void display(int a){
	        System.out.println("Arguments: " + a);
	    }
	    private static void display(int a, int b){
	        System.out.println("Sum of 2 vars : "+(a+b));
	    }
	    public static void main(String[] args) {
	        display(1);
	        display(1, 4);
	    }
}
