import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Students> lista = new HashSet<>();

        System.out.println("How many students for course A: ");
        int courseA = sc.nextInt();
        for (int i = 0; i < courseA; i++) {
            int ID = sc.nextInt();
            lista.add(new Students(ID));
        }

        System.out.println("How many students for course B: ");
        int courseB = sc.nextInt();
        for (int i = 0; i < courseB; i++) {
            int ID = sc.nextInt();
            lista.add(new Students(ID));
        }

        System.out.println("How many students for course C: ");
        int courseC = sc.nextInt();
        for (int i = 0; i < courseC; i++) {
            int ID = sc.nextInt();
            lista.add(new Students(ID));
        }

        System.out.println(lista.size());
    }
}
