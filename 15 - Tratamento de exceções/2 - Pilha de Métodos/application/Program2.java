package application;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Program2 {
    public static void main(String[] args) {
        method1();

        System.out.println("End of program!");
    }

    public static void method1() {
        System.out.println("METHOD 1 START");
        method2();
        System.out.println("METHOD 1 END");
    }

    public static void method2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("METHOD 2 START");
        
        String[] vect = sc.nextLine().split(" ");
        int position = sc.nextInt();
        System.out.println(vect[position]);
         
        sc.close();
        System.out.println("METHOD 2 END");
    }
}

