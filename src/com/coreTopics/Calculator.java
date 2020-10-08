package com.coreTopics;

public class Calculator {

	void add() {

		int a = 20;
		int b = 30;

		int c = a + b;

		System.out.println("Addition is: " + c); // Concatenation operator

	}
	
	// sub, mul, div, modulo division /, %
	
   // ajaylvur@gmail.com	

	int add(int a, int b) {

		int d = a + b;

		System.out.println("Addition is: " + d);
		
		return d;
	}

	public static void main(String[] args) {
		Calculator obj = new Calculator(); // JVM

		obj.add(); //

		obj.add(125, 927);

		int k = obj.add(12, 27); // action1 > result 39 > action2 100-output

		int v = 100 - k;

		System.out.println("V value: " + v);

	}

}
