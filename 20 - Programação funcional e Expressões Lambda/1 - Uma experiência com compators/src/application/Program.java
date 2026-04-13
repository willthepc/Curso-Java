package application;

import entities.MyComparator;
import entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Notebook", 450.0));
        list.add(new Product("Tablet", 450.0));



// --------------COMPARADOR OBJETO DE CLASSE SEPARADA---------------------
        //list.sort(new MyComparator()); // 1° modo



// --------------COMPARADOR OBJETO DE CLASSE ANÔNIMA---------------------
        Comparator<Product> comp = new Comparator<Product>() { // 2° modo
           @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };
      list.sort(comp); //2° modo




// --------------COMPARADOR OBJETO DE EXPRESSÃO LAMBDA COM CHAVES---------------------
        Comparator<Product> comp2 = (p1, p2) -> { // 3° modo
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };
        list.sort(comp2); //3° modo





// --------------COMPARADOR OBJETO DE EXPRESSÃO LAMBDA SEM CHAVES---------------------
        Comparator<Product> comp3 = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()); // 4° modo
        list.sort(comp3); //4° modo





// --------------COMPARADOR OBJETO DE EXPRESSÃO LAMBDA "DIRETO NO ARGUMENTO"---------------------
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase())); //5° modo

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
