package assignment;

import java.util.Scanner;

class Student {
    Student() {
        System.out.println("Student object is created");
    }
}

class Commission {
    private String name;
    private String address;
    private String phone;
    private double salesAmount;

    public void acceptDetails(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Phone: ");
        phone = sc.nextLine();

        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextDouble();
        sc.nextLine(); // consume newline
    }

    public double calculateCommission() {
        if (salesAmount >= 100000) return salesAmount * 0.10;
        else if (salesAmount >= 50000) return salesAmount * 0.05;
        else if (salesAmount >= 30000) return salesAmount * 0.03;
        else return 0;
    }

    public void printSummary() {
        System.out.println("\n--- Commission Summary ---");
        System.out.println("Name    : " + name);
        System.out.println("Address : " + address);
        System.out.println("Phone   : " + phone);
        System.out.printf("Sales   : %.2f%n", salesAmount);
        System.out.printf("Commission: %.2f%n", calculateCommission());
    }
}

public class assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Commission c = new Commission();
        c.acceptDetails(sc);
        c.printSummary();

        sc.close();
    }
}
