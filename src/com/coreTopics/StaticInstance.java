package com.coreTopics;

public class StaticInstance {

	// static vs instance

	int i = 10; // instance
	static int j = 25; // static

	void test1() { // non static >

		System.out.println("I value: " + i);
		System.out.println("J value: " + j);
	}

	static void test2() {

	//	System.out.println("I value: " + i);
		System.out.println("J value: " + j);
	}

	public static void main(String[] args) {
		StaticInstance obj = new StaticInstance();
		
		obj.test1();
		
		
	}
	
}
