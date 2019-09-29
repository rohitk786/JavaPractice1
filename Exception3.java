package com.java;

/*
 * nested try-catch
 * finally block
 */
public class Exception3 {
	 public static void main(String args[]){
	      //main try-block
	      try{
	    	  System.out.println("1st try block...");
	        try{     
	            System.out.println("2nd try block...");
	            try{
	            	System.out.println("3rd try block...");
	            	int arr[]= {1,2,3,4};
	            	System.out.println(arr[10]);
	            }catch(ArithmeticException e){
	            	System.out.print("Arithmetic Exception");
	            	System.out.println(" handled in try-block3");
	            }
	        }
	        catch(ArithmeticException e){
	           System.out.print("Arithmetic Exception");
	           System.out.println(" handled in try-block2");
	        }
	    }
	    catch(ArithmeticException e3){
	    	System.out.print("Arithmetic Exception");
	     	System.out.println(" handled in main try-block");
	    }
	    catch(ArrayIndexOutOfBoundsException e4){
	    	System.out.print("ArrayIndexOutOfBoundsException");
	     	System.out.println(" handled in main try-block");
	    }
	    catch(Exception e5){
	    	System.out.print("Exception");
	     	System.out.println(" handled in main try-block");
	     }
	      finally{
	    		 System.out.println("This is finally block");
	    	      } 
	  }
}
