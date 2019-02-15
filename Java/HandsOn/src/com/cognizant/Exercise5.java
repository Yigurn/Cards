package com.cognizant;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Exercise5 {
	
	public static void main(String[] args) {
		Exercise5 run = new Exercise5();
		run.task();
	}
	
	public void task() {		
		String file = "employee_base.csv";
		String line = "";
		String cvsSplit = ",";
		String[][] employees = new String[4][4];
		//Hard coded employees size - don't use array
		int numOfEmpolyees = 0;
		try (BufferedReader fileIn = new BufferedReader(new FileReader(file))) {
			while ((line = fileIn.readLine()) != null) {
				String[] employee = line.split(cvsSplit);
				employees[numOfEmpolyees++] = employee;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		
		try (BufferedWriter fileOut = new BufferedWriter(new 
				OutputStreamWriter(new FileOutputStream("employee_bonus.csv"), "utf-8"))) {
			for (int j = 0; j < numOfEmpolyees; j++) {
				fileOut.write(employees[j][0] + ","
							+ employees[j][3] + ","
							+ Integer.parseInt(employees[j][3]) * 2);
				fileOut.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
