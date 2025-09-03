import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {


        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Fer");
        nomes.add("Leo");
        nomes.add("João");
        nomes.add("Maria");
        System.out.println(nomes.get(1));

        nomes.remove(0);
        System.out.println(nomes);
    }
}
