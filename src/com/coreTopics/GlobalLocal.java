package com.coreTopics;

public class GlobalLocal {

	// class, method, variable, object

	// Scope

	// Global, Local, Static, Instance

	int i = 20; // global

	void test1() {
		int k = 30; // local

		int i = 50;

		System.out.println("I value: " + i);
		System.out.println("K value: " + k);
	}

	void test2() {
		System.out.println("I value: " + i);

	}

	public static void main(String[] args) {
		GlobalLocal obj = new GlobalLocal();

		obj.test1();
		obj.test2();
	}

}
