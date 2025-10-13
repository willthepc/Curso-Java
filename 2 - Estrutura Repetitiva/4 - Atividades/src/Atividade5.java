public class Atividade5 {
    public static void main(String[] args) {
        int num1 = -5;
        int num2 = 6;
        int soma = 0;

        int menor, maior;

        if (num1 < num2) {
            menor = num1;
            maior = num2;
        } else {
            menor = num2;
            maior = num1;
        }

        for (int x = menor + 1; x < maior; x++) {
            if (x % 2 != 0) {
                soma += x;
            }
        }
        System.out.println("SOMA DOS IMPARES: " + soma);
    }
}
