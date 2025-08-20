package com.dhana.assignment;

import com.dhana.assignment.employee.Manager;
import com.dhana.assignment.employee.Developer;
import com.dhana.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Hema", 101, 80000, "Sales");
        Developer developer = new Developer("Leela", 102, 60000, "Java");

        EmployeeUtilities.printEmployeeDetails(manager);
        System.out.println("Department: " + manager.getDepartment());

        EmployeeUtilities.printEmployeeDetails(developer);
        System.out.println("Language: " + developer.getProgrammingLanguage());

        EmployeeUtilities.increaseSalary(manager, 10);
        EmployeeUtilities.increaseSalary(developer, 15);

        System.out.println("\nAfter Salary Hike:");
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}



