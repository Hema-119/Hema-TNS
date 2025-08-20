package assignment;

import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter Roll Number: ");
        String rollStr = sc.nextLine().trim();

        System.out.print("Enter Grade: ");
        String grade = sc.nextLine().trim();

        System.out.print("Enter Percentage: ");
        String percentage = sc.nextLine().trim();

        System.out.println("\n--- Student Details ---");
        System.out.println(name);
        System.out.println(rollStr);
        System.out.println(grade);
        System.out.println(percentage);

        sc.close();
    }
}
