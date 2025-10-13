import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = 2312;
        int user = 0000;
        while (user != senha){
            System.out.println("Digite a senha: ");
            user = sc.nextInt();
            if(user != senha) {
                System.out.println("Senha Inválida! Tente novamente...");
            }
        }

        System.out.println("Acesso permitido!");
    }
}
