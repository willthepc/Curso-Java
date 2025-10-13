import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a tabuada desejada: ");
        int tab = sc.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.println(tab + " x " + i + " = " +tab*i);
        }
    }
}
