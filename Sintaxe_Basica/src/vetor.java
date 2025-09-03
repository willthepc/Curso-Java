public class vetor {
    public static void main(String[] args) {
        int[] lista = {1,2,3,4,5,4444};
        System.out.println(lista.length);

        int[] meusNumeros = new int[3];
        for(int i = 0; i < meusNumeros.length; i++) {
            System.out.println(meusNumeros[i]);
        }

        String[] nomes = new String[10];
        nomes[0] = "Fer";
        nomes[1] = "Will";
        nomes[2] = "Maria";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}