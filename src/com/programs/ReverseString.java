package com.programs;

public class ReverseString {

	String s = "world"; // dlrow 0-w 1-o 2-r 3-l 4-d 5

	String output = "";
	
	// Strings, Characters, Numbers

	// for loop, while, do while

	void reverseWord() {

		int wordLength = s.length(); // 5

		for (int i = wordLength - 1; i >= 0; i--) { // i=4 3 2

			char c = s.charAt(i); // d l

			output = output + c; // d+l+r+o+w dlrow
		}

		System.out.println("Output is: " + output);
	}

	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		obj.reverseWord();
	}

}
