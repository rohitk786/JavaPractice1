package com.java;
/*
 * nested while loop example
 */
public class WhileLoopsEg3 {
	public static void main(String[] args) {
		
		 int outerLoop = 1;
	        while(outerLoop < 3)
	        {
	            int innerLoop = 5; 
	            while(innerLoop < 8)
	            {
	                System.out.println(outerLoop + "  " + innerLoop);
	                innerLoop++;
	            }
	            outerLoop++;
	        }
	}

}
