import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o coeficiente A: ");
        int a = sc.nextInt();
        System.out.println("Digite o coeficiente B: ");
        int b = sc.nextInt();
        System.out.println("Digite o coeficiente C: ");
        int c = sc.nextInt();
        int delta = (b*b)  - (4 * a * c);
        if (delta > 0) {
        double raiz = Math.sqrt(delta);
        double x1 = (-b + raiz) / 2 * a;
        double x2 = (-b - raiz) / 2 * a;
        System.out.println("X1: " + x1);
        System.out.println("X2: " + x2);
        } else {
            System.out.println("Delta negativo: " + delta);
        }
    }
}
