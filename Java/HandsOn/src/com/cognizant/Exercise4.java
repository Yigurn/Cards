package com.cognizant;

import java.util.Scanner;

public class Exercise4 {
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Exercise4 run = new Exercise4();
		run.task();
	}
	
	public void task() {
		String text = "Welcome to Java World";
		System.out.println(text.charAt(5));
		System.out.println(text.compareToIgnoreCase("Welcome"));
		text += " - Let us learn";
		System.out.println(text);
		System.out.println(text.indexOf("a"));
		System.out.println(text.toLowerCase());
	}
	
	public String scan() {
		String input = scan.nextLine();
		return input; 
	}
}
