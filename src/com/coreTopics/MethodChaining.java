package com.coreTopics;

public class MethodChaining {

	MethodChaining test1() {
		System.out.println("In test1");
		return obj;
	}

	MethodChaining test2() {
		System.out.println("In test2");
		return obj;
	}

	MethodChaining test3() {
		System.out.println("In test3");
		return obj;
	}

	void test4() {
		System.out.println("In test4");
	}

	static MethodChaining obj = new MethodChaining();

	public static void main(String[] args) {

		obj.test1().test2().test3().test4();

	}

}
