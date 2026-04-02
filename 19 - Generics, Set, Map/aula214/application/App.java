import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        //hashset rapido mas não garante ordem
        //treeset ordem alfabetica
        //linkedhashset mantem a ordem que voce colocou

        //remove remove o item que voce escolher
        //removeIf vai remover de acordo com a sua condição

        Set<String> set = new LinkedHashSet<>();

        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        set.removeIf(x -> x.charAt(0) == 'T');


        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }
    }
}



























