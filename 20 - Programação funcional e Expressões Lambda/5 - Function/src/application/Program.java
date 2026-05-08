package application;

import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("HD Case", 80.50));

        //---------------------------IMPLEMENTACAO DA INTERFACE----------------------------------
        //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());


        //---------------------------METODO REFERENCIAL COM METODO ESTATICO----------------------------------
        //List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());


        //---------------------------METODO REFERENCIAL COM METODO NAO ESTATICO----------------------------------
        //List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());


        //---------------------------EXPRESSAO LAMBDA DECLARADA----------------------------------
        //Function<Product, String> func = p -> p.getName().toUpperCase();
        //List<String> names = list.stream().map(func).collect(Collectors.toList());


        //---------------------------EXPRESSAO LAMBDA INLINE------------------------------------
        //List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());







        names.forEach(System.out::println);
    }
}





















