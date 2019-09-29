package com.java;

public class WhileLoop6 {

	  public static void main(String args[]){
	      int num =0;
	      while(num<=100)
	      {
	          System.out.println(num);
	          if (num==2)
	          {
	             break;
	          }
	          num++;
	      }
	      System.out.println("Out of loop due to break");
	  }
}
