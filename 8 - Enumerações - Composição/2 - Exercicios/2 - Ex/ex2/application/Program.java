package ex2.application;

import ex2.entities.Client;
import ex2.entities.OrderItem;
import ex2.entities.Product;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        List<OrderItem> produtos = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.println("Nome: ");
        String name = sc.nextLine();

        System.out.println("E-mail: ");
        String email = sc.nextLine();

        System.out.println("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        Client cliente = new Client(name, email, birthDate);

        System.out.println("Enter Order Data: ");

        System.out.println("Status: ");
        String orderStatus = sc.next();

        System.out.println("Status: " + orderStatus);

        System.out.println("How many items to this order: ");
        int qtd = sc.nextInt();
        for (int i = 1; i <= qtd; i++) {
            System.out.println("Enter #" + (i) + " data");

            System.out.println("Product name: ");
            String nameP = sc.next();
            System.out.println("Product price: ");
            Double priceP = sc.nextDouble();
            Double priceI = priceP;
            System.out.println("Quantity: ");
            Integer quantity = sc.nextInt();

            Product product = new Product(nameP, priceP);
            OrderItem orderItem = new OrderItem(quantity, priceI, product);
            produtos.add(orderItem);
        }
        
        System.out.println("Order Sumary: ");

        System.out.println("Order moment: " + sdf.format(cliente.getBirthDate()));
        System.out.println("Order status: " + orderStatus);
        System.out.println("Client: " + cliente.getName() + " (" + sdf.format(cliente.getBirthDate()) + ") - " + cliente.getEmail());

        System.out.println("Order items: ");
        Double total = 0.0;
        for (OrderItem i : produtos) {
            System.out.println(i.getProduct() + ", Quantity: " + i.getQuantity() + ", Subtotal: " + i.subTotal());
            total += i.subTotal();
        }
        System.out.println("Total Value: " + total);

    }
}
