import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = "c:\\temp\\ex.txt";
        Product product = new Product();
        List<Product> lista = new ArrayList<>();


        while(true) {
            System.out.println("=== MENU ===");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Gerar arquivo 'txt'");
            System.out.println("3 - Sair\n");
            Integer option = sc.nextInt();
            if (option.equals(1)) {
                sc.nextLine();
                System.out.println("Enter name of product: ");
                String name = sc.nextLine();

                System.out.println("Enter price of product: ");
                Double price = sc.nextDouble();

                System.out.println("Enter quantity of product: ");
                Integer quantity = sc.nextInt();

                Double subTotal = quantity * price;
                product = new Product(name, price, quantity, subTotal);

                lista.add(product);

            } else if (option.equals(2)) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
                    for (Product produto : lista) {
                        bw.write(produto.getName() + ", " + produto.getSubTotal());
                        bw.newLine();
                    }
                    System.out.println("Arquivo criado!\n");

                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            else if (option.equals(3)) {
                System.out.println("Saindo...");
                break;
            }
        }


    }
}
