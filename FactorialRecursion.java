package com.java;

import java.util.Scanner;
/*
 * factorial using recursion
 */
public class FactorialRecursion {
	 static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }    
		 public static void main(String args[]){  
		  int fact=1;
		  System.out.print("Enter the number... : ");
		  Scanner scan = new Scanner(System.in);
		  int number = scan.nextInt();   
		  fact = factorial(number);   
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
}
