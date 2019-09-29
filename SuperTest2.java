package com.java;

class Demo{  
	void display(){
		System.out.println("display() from demo invoked...");
		}  
}

class SuperTest2 extends Demo{  
	void display(){
		System.out.println("display()  from supertest invoked...");
		}  
	void run(){
		System.out.println("run() from supertest invoked...");
		}  
	void work(){  
		super.display();
		run(); 
	}  
}