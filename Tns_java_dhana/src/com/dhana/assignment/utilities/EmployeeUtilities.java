package com.dhana.assignment.utilities;

import com.dhana.assignment.employee.Employee;

public class EmployeeUtilities {
	 public static void printEmployeeDetails(Employee e) {
	        System.out.println("Employee ID: " + e.getEmployeeId());
	        System.out.println("Name: " + e.getName());
	        System.out.println("Salary: " + e.getSalary());
	    }

	    // Increase salary
	    public static void increaseSalary(Employee e, double percentage) {
	        double newSalary = e.getSalary() + (e.getSalary() * percentage / 100);
	        e.setSalary(newSalary);
	    }
	}

