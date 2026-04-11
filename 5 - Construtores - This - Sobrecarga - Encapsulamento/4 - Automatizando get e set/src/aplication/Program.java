package aplication;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

        product.setName("Computer");
        System.out.println("Uptaded name: " + product.getName());
        product.setPrice(1200);
        System.out.println("Uptaded price: " + product.getPrice());

        System.out.println(product);

        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.AddProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();

        System.out.println("Enter the number of products to be remove in stock: ");
        int remove = sc.nextInt();
        product.RemoveProduct(remove);
        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();

        sc.close();
    }
}
