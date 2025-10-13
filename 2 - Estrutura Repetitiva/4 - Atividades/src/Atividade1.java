import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        while(true) {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            if (num1 > num2) {
                System.out.println("Crescente");
            } else if (num1 < num2){
                System.out.println("Decrescente");
            } else {
                break;
            }
        }
    }
}
