package Calculator;

public class classs {
    public static double iof = 0.06;

    public static double Trans(double dolar, double qtd) {
        double tax = (dolar * qtd) * iof;
        return (dolar * qtd) + tax;
    }
}
