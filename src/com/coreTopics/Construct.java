package com.coreTopics;

public class Construct {

	Construct() { // Constructor
		System.out.println("do this while creating object");
	}

	// default, parameterized

	Construct(int a, int b) { // overloading

		int c = a + b;
		System.out.println("C is: " + c);

	}

	public static void main(String[] args) {

		Construct obj = new Construct(23, 62);

		obj.test1();

	}

	void test1() {
		System.out.println("do some transaction");
	}

}
