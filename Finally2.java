package com.java;

/*
 * finally when system.exit is used
 * here if the System.exit(0) gets called without any exception 
 * then finally won’t execute 
 */
public class Finally2 {
	public static void main(String[] args) {
		
		try {
			   //try block
			   System.out.println("Inside try block");
			//   int a = 30/0;
			   System.exit(0);  
			}
			catch (Exception exp) {
			   System.out.println(exp);
			}
			finally {
			   System.out.println("Java finally block");
			}
		System.out.println("last statement after try-catch-finally..");
	}
}
