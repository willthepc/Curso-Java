import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.println("Enter the number of tax payer: ");
        int qtd = sc.nextInt();

        for (int i = 1; i <= qtd; i++) {
            System.out.println("Tax payer #" + (i) + " data: ");
            System.out.println("Individual or company (i/c): ");
            String option = sc.next();
            if (option.equals("i")) {
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Anual income: ");
                Double anuallncome = sc.nextDouble();
                System.out.println("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                TaxPayer taxpayer = new Individual(name, anuallncome, healthExpenditures);
                list.add(taxpayer);
            } else if (option.equals("c")) {
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Anual income: ");
                Double anuallncome = sc.nextDouble();
                System.out.println("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                TaxPayer taxPayer = new Company(name, anuallncome, numberOfEmployees);
                list.add(taxPayer);
            }
        }

        Double valorFinal = 0.0;
        for (TaxPayer taxa : list) {
            System.out.println(taxa.getName() + " -> " + String.format("%.2f", taxa.tax()));
            valorFinal += taxa.tax();
        }
        System.out.println("\nValor final: " + String.format("%.2f", valorFinal));
    }
}
