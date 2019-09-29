package com.java;

import java.util.Scanner;

/*
 * Number to check armstrong or not
 */
public class WhileLoopEg2 {

	public static void main(String[] args) {
			
	        int number , originalNumber, remainder;
	        int result = 0;
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the 3 digit number : ");
	        number = scan.nextInt();
	        originalNumber = number;
	        while (originalNumber != 0)
	        {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, 3);
	            originalNumber /= 10;
	        }
	        if(result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
		
	}

}
