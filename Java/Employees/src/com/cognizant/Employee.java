package com.cognizant;

public class Employee {
	long employeeID, employeePhone;
	String employeeName, employeeAddress;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;
	
	Employee(long id, String name, String address, long phone) {
		employeeID = id;
		employeeName = name;
		employeeAddress = address;
		employeePhone = phone;
	}
	
	public void calculateSalary() {
		double salary = basicSalary + (basicSalary + specialAllowance / 100)
				+ (basicSalary + hra / 100);
		System.out.println("Salary: " + salary);
	}
	
	public void calculateTransportAllowance() {
		double transportAllowance = 10.0 / 100 * basicSalary;
		System.out.println("Transport Allowance: " + transportAllowance);
	}
}
