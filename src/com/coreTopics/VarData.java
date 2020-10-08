package com.coreTopics;

public class VarData {

	// action(business logic), data
	// methods , variables

	// Primitive data types(single), arrays(group of values), collections

	// 1-9, A-Z, a-z, $%&^

	// Integers, Strings, Characters, Boolean

	int i = 999999999; // 10, dataType > int

	float f = 21.34f;

	boolean b = false; // true/false
	char c = 'D'; // a=z A-Z

	double d = 999999999; // short, byte

	String s = "hello all, this is java";
	// =============================================================================================

	int x = 21, y = 36;

	public static void main(String[] args) {

		VarData obj = new VarData();

		String l = obj.s;

		System.out.println(l);

		l = l.toUpperCase();

		System.out.println(l);

		l = l.replace('A', 'Y');

		System.out.println(l);
		
		System.out.println(l.toCharArray());	

	}

}
