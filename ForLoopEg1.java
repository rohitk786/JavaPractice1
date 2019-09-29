package com.java;

import java.util.Scanner;

/*
 * even or odd program
 */
public class ForLoopEg1 {
	public static void main(String[] args) {
	
		System.out.print("Enter the number upto which you want to print : ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println("printing even nos...");
		for(int i = 1; i<=number; i++) {
			if(i%2 == 0) {
				System.out.print(i+" ");
			}
		}
		/*
		 * Logic for odd nos
		 * System.out.println("printing odd nos..."); 
		 * for(int i = 1; i<=number; i++) {
		 * if(i%2 != 0) { System.out.print(i+" "); } }
		 */
	}

}
