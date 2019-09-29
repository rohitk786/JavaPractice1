package com.java;

import java.util.Scanner;
/*
 * swapping values without using 3rd variable
 */
public class SwapNumbers {
	public static void main(String[] args) {
	
	System.out.println("Enter the 2 values : ");	
	Scanner scan = new Scanner(System.in);
	int x  = scan.nextInt();
	int y = scan.nextInt();
	System.out.println("Values before swapping..."+x+" "+y);
	x = x+y;
	y = x-y;
	x = x-y;
	System.out.println("values after swapping..."+x+" "+y);
	}
}
