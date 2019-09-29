package com.java;

import java.util.Scanner;

/*
 * Printing start pattern with user's input
 */
public class ForEg3 {

	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);
	      System.out.print("Enter the number of rows needed to print the pattern ");
          int rows = scanner.nextInt();
	      
          System.out.println("Printing the pattern...");
	        
	      for (int i=1; i<=rows; i++){
	            for (int j=1; j<=i; j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}
}
