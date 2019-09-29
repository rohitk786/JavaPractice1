package com.java;

/*
 * java8 feature of using static method in interface
 */
interface in1 
{ 
    final int a = 10; 
    static void display() 
    { 
        System.out.println("hello"); 
    } 
} 
   
public class InterfaceEg2 implements in1 
{ 
    public static void main (String[] args) 
    { 
        in1.display(); 
    } 
} 