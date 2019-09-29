package com.java;

import java.util.Scanner;

/*
 * Num is Palindrome or not 
 */
public class WhileLoopEg1 {

	public static void main(String[] args) {
		
		int num , reversedInteger = 0, remainder, originalInteger;
		System.out.print("Enter the number : ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
        originalInteger = num;
        
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }
        
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");

	}

}
