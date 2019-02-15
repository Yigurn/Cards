package com.cognizant;

import java.util.Scanner;

public class Exercise3 {
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Exercise3 run = new Exercise3();
		run.task();
	}
	
	public void task() {
		int month = 0;
		do {
		System.out.print("Please enter a number: ");
		 month = checkInput(scan());
		} while (month == -1);
		
		switch(month) {
			case 1: System.out.println("January");
			case 2: System.out.println("February");
			case 3: System.out.println("March");
			case 4: System.out.println("April");
			case 5: System.out.println("May");
			case 6: System.out.println("June");
			case 7: System.out.println("July");
			case 8: System.out.println("August");
			case 9: System.out.println("September");
			case 10: System.out.println("October");
			case 11: System.out.println("November");
			case 12: System.out.println("December");
		}
		
	}

	
	public String scan() {
		String input = scan.nextLine();
		return input; 
	}
	
	public int checkInput(String input) {
		try {
			int month = Integer.parseInt(input);
			
			if (month >= 1 && month <= 12)
				return month;
			else
				throw new InvalidChoiceException("Error - Input out of range (1 and 12)");
		}
		catch (InvalidChoiceException e) {
			System.out.println(e.getMessage());
			return -1;
		}
		catch (NumberFormatException e) {
			System.out.println("Error - Input was not a number (4)");			
			return -1;
		}
		
		
		
		
	}

}
