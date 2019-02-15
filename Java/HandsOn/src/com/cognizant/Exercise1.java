package com.cognizant;

import java.util.Scanner;

public class Exercise1 {
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Exercise1 run = new Exercise1();
		run.task();
	}
	
	public void task() {
		boolean result = false;
		System.out.print("Enter an array: ");
		String[] array = splitArray(scan());
		
		if  (array[0].equals(array[array.length - 1]))
			result  = true;
		
		System.out.println(result);
	}
	
	public String scan() {
		String input = scan.nextLine();
		return input; 
	}
	
	public String[] splitArray(String array) {		
		String[] nums = array.split(" ");
		return nums;
	}

}
