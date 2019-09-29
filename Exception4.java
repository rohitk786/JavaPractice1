package com.java;
/*
 * nested try-catch eg2
 * try-catch inside try-catch
 * finally block
 */
public class Exception4 {
	public static void main(String args[]){
		 //Outer try block
	     try{
	    	//inner try block1
	         try{
	            System.out.println("Inside block1");
	            int b =45/0;
	            System.out.println(b);
	         }
	         catch(ArithmeticException e1){
	            System.out.println("Exception: e1");
	         }
	         //inner try block2
	         try{
	            System.out.println("Inside block2");
	            int b =45/0;
	            System.out.println(b);
	         }
	         catch(ArrayIndexOutOfBoundsException e2){
	            System.out.println("Exception: e2");
	         }
	        System.out.println("Just other statement");
	    }
	    catch(ArithmeticException e3){
	    	 System.out.println("Arithmetic Exception e3");
	         System.out.println("Inside parent try catch block");
	    }
	    catch(ArrayIndexOutOfBoundsException e4){
	    	System.out.println("ArrayIndexOutOfBoundsException");
	         System.out.println("Inside parent try catch block");
	    }
	    catch(Exception e5){
	    	System.out.println("Exception");
	         System.out.println("Inside parent try catch block");
	    }
	     finally{
	    	 System.out.println("This is finally block");
	          } 
	    System.out.println("Last statement..");
	  }
}
