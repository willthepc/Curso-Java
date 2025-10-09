import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float ar1 = sc.nextFloat();
        float ar2 = sc.nextFloat();
        float ar3 = sc.nextFloat();
        float tot = Math.max(ar1,ar2);
        float tot2 = Math.max(tot, ar3);
        System.out.println("Arremesso com maior distância: " + tot2);
    }
}
