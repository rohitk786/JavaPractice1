package com.java;

/*
 * try-catch with multiple catch blocks and finally block
 */
public class Exception2 {
	 public static void main(String args[]){
	     try{
	         int a[]=new int[3];
	         a[4]=30/0;        //arithmetic excptn
	         //a[4] = 30/2;      //arrayindexoutofbound excpt
	         System.out.println("1st print statement in try block");
	     }
	     catch(ArithmeticException e){
	        System.out.println("Warning: ArithmeticException");
	     }
	     catch(ArrayIndexOutOfBoundsException e){
	        System.out.println("Warning: ArrayIndexOutOfBoundsException");
	     }
	     catch(Exception e){
	        System.out.println("Warning: Other exception");
	     }
	     finally{
	    	 System.out.println("This is finally block");
	          } 
	   System.out.println("last statement block...");
	  }
	
}
