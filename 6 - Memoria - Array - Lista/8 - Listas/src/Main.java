import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Declaração

        List<String> lista = new ArrayList<>();

        // Adicionar itens
        lista.add("Maria");
        lista.add("Jota");
        lista.add("Lucas");
        lista.add("Mariana");
        lista.add("William");
        lista.add("Ronaldo");
        lista.add("Jotinha");

        // Remover item pelo nome e pelo index
        lista.remove("Lucas");
        lista.remove(1);

        // Adicionar escolhendo index
        lista.add(2, "Marco");

        for (String i : lista) {
            System.out.println(i);
        }

        // Tamanho da lista
        System.out.println(lista.size());

        System.out.println("------------------");

        // Encotrar elemento pelo nome, se não existir retorna -1
        System.out.println("Index of Bob: " + lista.indexOf("Jotinha"));

        System.out.println("------------------------");

        // Remover com condição
        lista.removeIf(x -> x.charAt(0) == 'R');
        for (String x : lista) {
            System.out.println(x);
        }

        System.out.println("--------------------------");

        // Filtrar a lista de modo que fique com tal inicial
        List<String> result = lista.stream().filter(x -> x.charAt(0) == 'M').toList();
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("------------------------");

        String name = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}