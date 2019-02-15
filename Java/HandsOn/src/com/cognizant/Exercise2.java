package com.cognizant;

import java.util.Scanner;

public class Exercise2 {
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Exercise2 run = new Exercise2();
		run.task();
	}
	
	public void task() {
		boolean result = false;
		System.out.print("Enter an array: ");
		String[] array1 = splitArray(scan());

		System.out.print("Enter another array: ");
		String[] array2 = splitArray(scan());

		if  (array1[0].equals(array2[0]) || (array1[array1.length - 1].equals(array2[array2.length - 1])))
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
