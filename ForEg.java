package com.java;

/*
 * for with break and continue..
 */
public class ForEg {
	public static void main(String[] args) {
		
		for(int i = 0;i<5;i++ ) {
			if(i == 3) {
				//break;
				continue;
			}
			System.out.println(i);
		}
	}
}
