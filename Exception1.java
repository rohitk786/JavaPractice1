package com.java;

/*
 * try-catch-finally eg
 */
public class Exception1 {
	public static void main(String[] args) {
		int num1, num2;
	      try {
	         num1 = 0;
	         num2 = 62 / num1;
	         System.out.println(num2);
	         System.out.println("at the end of try block");
	      }
	      catch (ArithmeticException e) { 
	         System.out.println("You should not divide a number by zero");
	      }
	      catch (Exception e) {
	         System.out.println("Exception occurred");
	      }
	      finally{
	    		 System.out.println("This is finally block");
	    	      } 
	      System.out.println("last statement");
	   }
}
