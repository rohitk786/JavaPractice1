package com.java;

/*
 * overriding/inheritance with access-specifier
 */
class Parent { 
    // private methods are not overridden 
    private void m1() 
    { 
        System.out.println("From parent m1()"); 
    } 
  
    protected void m2() 
    { 
        System.out.println("From parent m2()"); 
    } 
} 
  
class Child extends Parent { 
    // new m1() method & unique to Child class 
    private void m1() 
    { 
        System.out.println("From child m1()"); 
    } 
  
    // overriding method 
    @Override
    public void m2() 
    { 
        System.out.println("From child m2()"); 
    } 
} 

public class TestOverriding2 { 
    public static void main(String[] args) 
    { 
        Parent obj1 = new Parent(); 
        obj1.m2(); 
        Parent obj2 = new Child(); 
        obj2.m2(); 
    } 
} 
