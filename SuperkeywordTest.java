package com.java;

public class SuperkeywordTest extends SuperKeyword{

	/*
	 * here superkeywordtest class is extending SuperKeyword
	 * so both constructors has to call parent class constructor
	 * since it is paramterized constructor
	 * If SuperKeyword class is not having any constructor or
	 * parameter-less constructor then its not required
	 */
	SuperkeywordTest(){
		super(10,20);
		System.out.println("SuperkeywordTest const invoked..");
	}
	SuperkeywordTest(int a, int b){
		super(a,b);
		System.out.println("SuperkeywordTest paramterized const invoked..");
	}
	
	public static void main(String[] args) {
		SuperkeywordTest sk = new SuperkeywordTest();
		SuperkeywordTest sd = new SuperkeywordTest(10,35);
		
	}
}

	