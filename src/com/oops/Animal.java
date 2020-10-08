package com.oops;

public class Animal implements Dog, Lion {

	public void bark() { // define
		System.out.println("it is barking");
	}

	public void roar() {
		System.out.println("it is roaring");

	}

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.bark();
		animal.roar();

		Dog dog = new Animal();
		dog.bark();
		
		Lion lion = new Animal();
		lion.roar();

	}

}

interface Dog {

	void bark(); // declare, define

}

interface Lion {

	void roar();
}
