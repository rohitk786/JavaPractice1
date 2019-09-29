package com.java;

/*
 * try with finally
 */
public class FinallyBlock {
	public static void main(String args[])
	   {
	      System.out.println(FinallyBlock.myMethod());  
	   }
	   public static int myMethod()
	   {
	      try {
	        return 112;
	      }
	      finally {
	        System.out.println("This is Finally block");
	        System.out.println("Finally block ran even after return statement");
	      }
	   }
}
