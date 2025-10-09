import java.util.Objects;
import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha qual utilizar:");
        System.out.println("-> C para Celsius");
        System.out.println("-> F para Farenheit");
        String escolha = sc.nextLine();
        if (Objects.equals(escolha, "C") || Objects.equals(escolha, "c")) {
            System.out.println("Digite a temperatura em Celsius: ");
            float ce = sc.nextFloat();
            System.out.println("Temperatura equivalente em Fahrenheit: " + ((ce * 9/5) + 32));
        }

        else if (Objects.equals(escolha, "F") || Objects.equals(escolha, "f")) {
            System.out.println("Digite a temperatura em Fahrenheit: ");
            float fa = sc.nextFloat();
            System.out.println("Temperatura equivalente em Celsius: " + ((5 * (fa - 32)))/9);
        }

        else {
            System.out.println("Opção indisponível...");
        }
    }
}
