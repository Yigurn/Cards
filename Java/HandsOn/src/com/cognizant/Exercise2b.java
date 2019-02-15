package com.cognizant;

import java.util.Scanner;

public class Exercise2b {
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Exercise2b run = new Exercise2b();
		run.task();
	}
	
	public void task() {
		boolean result = false;
		String[] array1 = new String[0];
		while (array1.length % 2 != 1) {
			System.out.print("Enter an array: ");
			array1 = splitArray(scan());
			if (array1.length % 2 != 1)
				System.out.println("Array needs an odd number of elements");
		}

		String[] array2 = new String[0];
		while (array2.length % 2 != 1) {
			System.out.print("Enter another array: ");
			array2 = splitArray(scan());
			if (array2.length % 2 != 1)
				System.out.println("Array needs an odd number of elements");
		}
		System.out.println(array1[(array1.length - 1) / 2] + ", "
				+ array2[(array2.length - 1) / 2]);
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
