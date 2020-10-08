package com.oops;

public class Boiler {

	public static void main(String[] args) {

		Cooking cooking = new Cooking();

		cooking.boiling();
		
		cooking.cook();
		cooking.fry();
		
		cooking.boil();
		
		Chicken chicken = new Chicken();
		chicken.fry();
		chicken.cook();
		

	}
}
