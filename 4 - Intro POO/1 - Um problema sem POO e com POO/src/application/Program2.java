package application;

import entities.Triangle;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangule X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangule Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle X area: %.4f%n", areaY);

        if(areaY > areaX) {
            System.out.println("Área Y maior!");
        } else {
            System.out.println("Área X maior!");
        }

    }
}
