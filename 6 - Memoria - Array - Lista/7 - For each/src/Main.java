//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Sintaxe opcional e simplificada para percorrer coleções

        String[] vect = new String[] {"Maria", "Bob", "Alex"};
        for(int i=0; i<vect.length;i++) {
            System.out.println(vect[i]);
        }

        for(String y : vect) {
            System.out.println(y);
        }
    }
}