package com.java;

import java.util.Scanner;

/*
 * reversing entered no
 */
public class WhileLoopEg4 {

	public static void main(String[] args) {
		
	      int num, reverse = 0;
	         
	      System.out.print("Enter number to reverse : ");
	      Scanner scan = new Scanner(System.in);
	      num = scan.nextInt();
	         
	      while(num != 0)
	      {
	          reverse = reverse * 10;
	          reverse = reverse + num%10;
	          num = num/10;
	      }
	       
	      System.out.println("Result after reversing " + reverse);

	}

}
