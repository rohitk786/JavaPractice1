package com.java;

public class DoWhileEg2 {

	public static void main(String args[]){
		int j=0;
	        do
		{
		   if (j==7)
		   {
			 j++;
			 continue;
		   }
		   System.out.print(j+ " ");
		   j++;
	       }while(j<10);
	}
}
