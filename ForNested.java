package com.java;
/*
 * break & continue with nested for
 */
public class ForNested {
	public static void main(String[] args) {
		int k = 1;
		for(int i = 1;i<=4;i++) {
			for(int j = 1;j<=i ;j++) {
				if(i == 2 || j == 3) {
					//continue;
					break;
				}
				System.out.print(k+" ");
				k++;
			}
			System.out.println(" ");
		}
	}
}
