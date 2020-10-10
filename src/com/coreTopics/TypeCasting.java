package com.coreTopics;

public class TypeCasting extends PetAnimal {

	public static void main(String[] args) {

		TypeCasting obj = new TypeCasting(); // we can't create objects for abstract classes and interfaces
		// but we can use abstract classes and interfaces as reference types

		obj.bark(); // electrical work
		obj.meow(); // plumbing work

		PetAnimal obj1 = new TypeCasting();
		obj1.bark();
		obj1.meow();

		Cat obj2 = new TypeCasting(); // object > meow,bark referance > meow
		obj2.meow();

		Dog obj4 = (Dog) obj2;
		obj4.bark();

		/*
		 * Dog obj3 = new TypeCasting(); obj3.bark();
		 */

	}

}

interface Cat { // 100% abstract 10 methods all methods are abstract
	public void meow();
}

interface Dog {
	public void bark();
}

abstract class PetAnimal implements Cat, Dog { // 0 to 100% abstract 10 methods it can either implement 0 or 10 methods
	public void meow() { // 50%
		System.out.println("In meow");
	}

	public void bark() { // 50%
		System.out.println("In bark");
	}
}

// A B C

// Naveen Builder(Rooms, Interior, Electrical work) SomeOther
