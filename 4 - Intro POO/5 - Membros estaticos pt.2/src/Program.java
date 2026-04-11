import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);
        System.out.println(c);
        System.out.println(v);
        System.out.println(Calculator.PI);
    }
}
