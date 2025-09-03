public class casting {
    public static void main(String[] args) {
        double resultado = 0.0;
        int resultadoInt = (int) resultado;
        System.out.println(resultadoInt);

        int meuInt = 10;
        double meuDouble = meuInt;
        System.out.println(meuDouble);

        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);

        String minhaString = String.valueOf(meuInt2); //reconversao
    }
}
