import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entradaPass, entradaUser;
        String user = "admin";
        String pass = "admin";
        do {
            System.out.println("Usuário e senha!");
            entradaUser = sc.nextLine();
            entradaPass = sc.nextLine();
        } while (!user.equals(entradaUser) && !pass.equals(entradaPass));
    }
}