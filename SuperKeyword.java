package com.java;

/*
 * if parent class const is parameterized and child is extending it
 * super is mandatory to be use explicitly
 */
public class SuperKeyword{

	SuperKeyword(int a, int b){
		System.out.println("test constructor invoked");
		System.out.println("sum of a & b "+(a+b));
		
		//if const without parameter
		//System.out.println("constructor invoked");
		//System.out.println("sum of a & b ");
	}
}
