//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        double price = 400.00;
        //declarar discount fora com algum valor, se o if for falso pelo menos terá algum valor

        if (price < 200.00) {
            double discount = price * 0.1;
        }
        System.out.println(discount); //fora do escopo if, comentarios acima
    }
}