package aplication;

import entities.Product;
import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();

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
