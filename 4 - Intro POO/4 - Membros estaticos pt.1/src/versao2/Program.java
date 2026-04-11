package versao2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calculator = new Calculator();

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        double c = calculator.circumference(radius);
        double v = calculator.volume(radius);
        System.out.println(c);
        System.out.println(v);
        System.out.println(calculator.PI);
    }
}
