package com.java;

/*
 * implementing interface
 */
public class InterFaceTest1 implements InterfaceEg1{

	@Override
	public int display() {
	  System.out.println("display() is invoked...");
		return 10;
	}
	public static void main(String[] args) {
		InterFaceTest1 i = new InterFaceTest1();
		i.display();
		System.out.println(i.id);
	}
}
