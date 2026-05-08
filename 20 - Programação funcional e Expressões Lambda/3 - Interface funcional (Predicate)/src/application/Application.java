package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("HD Case", 80.50));

//----------------------------IMPLEMENTAÇÃO DA INTERFACE--------------------------------
        //list.removeIf(new ProductPredicate());

//----------------------------METODO REFERENCIAL COM METODO ESTATICO--------------------------------
        //list.removeIf(Product::staticProductPredicate);

//----------------------------METODO REFERENCIAL COM METODO NAO ESTATICO--------------------------------
        //list.removeIf(Product::nonStaticProductPredicate);

//----------------------------EXPRESSAO LAMBDA DECLARADA-------------------------------
        //double min = 100.0;
        //Predicate<Product> pred = p -> p.getPrice() >= min;
        //list.removeIf(pred);

//----------------------------EXPRESSAO LAMBDA INLINE--------------------------------
        list.removeIf(p -> p.getPrice() >= 100);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}


























