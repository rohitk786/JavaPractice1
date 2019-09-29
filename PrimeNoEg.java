package com.java;

import java.util.Scanner;

public class PrimeNoEg {
	   public static void main(String[] args) {
		   System.out.print("Enter the number ... : ");
		   Scanner scan = new Scanner(System.in);
		   int num = scan.nextInt();
	        boolean flag = true;
	        for(int i = 2; i <= num/2; ++i)
	        {
	            if(num % i == 0)
	            {
	                flag = false;
	                break;
	            }
	        }
	        if (flag)
	            System.out.println(num + " is a prime number.");
	        else
	            System.out.println(num + " is not a prime number.");
	    }
}
