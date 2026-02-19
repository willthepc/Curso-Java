package aula144.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import aula144.entities.Individual;
import aula144.entities.TaxPayer;
import aula144.entities.Company;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.println("Enter the number of tax payer: ");
        int qtd = sc.nextInt();

        for (int i = 0; i <= qtd; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.println("Individual or company (i/c): ");
            String option = sc.next();
            if (option == "i") {
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Anual income: ");
                Double anuallncome = sc.nextDouble();
                System.out.println("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                TaxPayer taxpayer = new Individual(name, anuallncome, healthExpenditures);
                list.add(taxpayer);
            } else if (option == "c") {
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
        for (TaxPayer taxa : list) {
            
        }
    }
}
