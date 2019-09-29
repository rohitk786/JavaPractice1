package com.java;

/*
 * abstract class example
 */
abstract class Test{
	   //abstract method
	   public abstract void display();
	   public void demo() {
		   System.out.println("this is demo for abstract class");
	   }
	}

class Test2 extends Test{
	 public void display(){
			System.out.println("display method invoked");
		   }
}

public class AbstractEg1 extends Test2{
	   
	   public static void main(String args[]){
		Test2 t = new Test2();
		t.demo();
		t.display();
	   }
	}