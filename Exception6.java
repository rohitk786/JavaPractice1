package com.java;

/*
 * throws and throw keyword
 */
import java.io.IOException;

class ThrowsEg { 
	  void myMethod(int num)throws IOException, ClassNotFoundException{ 
	     if(num == 1)
	        throw new IOException("IOException Occurred");
	     else
	        throw new ClassNotFoundException("ClassNotFoundException");
	  } 
	} 

public class Exception6{ 
	  public static void main(String args[]){ 
	   try{ 
	     ThrowsEg obj=new ThrowsEg(); 
	     obj.myMethod(1); 
	   }catch(Exception ex){
	     System.out.println(ex);
	    }
	   finally{
		   System.out.println("finally block...");
	   }
	   System.out.println("last statement");
	 }
}