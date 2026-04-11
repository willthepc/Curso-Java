import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        System.out.println("Digite a quantidade de números: ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        
        for (int i = 0;i<n; i++) {
            System.out.println("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS: ");
        for (int j : vect) {
            if (j < 0) {
                System.out.println(j);
            }
        }
    }
}