package com.java;

import java.util.Scanner;

/*
 * prog to print power of 1/power of 2....
 */
public class ForLoopEg {
	public static void main(String[] args) {
		System.out.print("enter the number.. : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int power = 2 ;
		for(int i = 0; i<num;i++) {
			System.out.print(1+"/"+power+" ");
			power = power*2;
		}
	}
}
