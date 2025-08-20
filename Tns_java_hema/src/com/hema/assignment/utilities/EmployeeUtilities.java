package com.hema.assignment.utilities;
import com.hema.assignment.employee.Employee;

public class EmployeeUtilities {


    // Print employee details
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



