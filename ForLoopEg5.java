package com.java;

public class ForLoopEg5 {
	 public static void main(String args[]){
			int var;
			for (var =100; var>=10; var --)
			{
			    System.out.println(var);
			    if (var==99)
			    {
			         break;
			    }
			 }
			 System.out.println("Out of loop due to break");
		   }

}
