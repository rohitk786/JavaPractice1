package com.java;

/*
 * for loop with continue eg
 */
public class ForLoopEg4 {

	public static void main(String[] args) {
		
		for (int j=0; j<=6; j++)
		{
	           if (j==4)
	           {
		      continue;
		   }

	           System.out.print(j+" ");
		}

	}

}
