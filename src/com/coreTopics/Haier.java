package com.coreTopics;

public class Haier {
	
	
	public static void main(String[] args) {
		
		
		Haier.test2(); // static referance
		
		Haier obj = new Haier();
		
		obj.test1();  // object referance
		obj.test2();
		
	}
	
	// instance methods, static methods
	
	void test1() {
		System.out.println("this is instance method");
	}
	
	
	static void test2() {
		System.out.println("this is static method");
	}
	
	

}
