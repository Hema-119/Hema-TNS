package assignment;

import java.util.Scanner;

class Circle {
    private double radius;
    private String colour;

    public void getInput(Scanner sc) {
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Enter colour: ");
        colour = sc.nextLine();
    }

    public void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("\n--- Circle Details ---");
        System.out.println("Colour: " + colour);
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Area  : %.4f%n", area);
    }
}

public class assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        c.getInput(sc);
        c.calcArea();
        sc.close();
    }
}
