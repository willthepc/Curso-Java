package Program;

import entities.Rent;
import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.println("How many rooms will be rented: ");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.println("Rent: " + (i));

            System.out.println("Name: ");
            String name = sc.next();

            System.out.println("Email: ");
            String email = sc.next();

            System.out.println("Room: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Rent(name, email);
        }

        System.out.println("Busy rooms: ");
        for (int z = 0; z < 10; z++) {
            if (vect[z] != null) {
                System.out.println((z) + ": " + vect[z]);
            }
        }
    }
}