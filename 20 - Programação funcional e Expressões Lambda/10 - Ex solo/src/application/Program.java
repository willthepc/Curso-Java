package application;

import entities.People;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the path file: ");
        String path = sc.next();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<People> list = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                list.add(new People(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.println("Salário: ");
            Double salary = sc.nextDouble();

            System.out.println("Email of people whose salary is more than 2000.00: ");
            List<String> mais2000 = list.stream()
                    .filter(x -> x.getSalary() > 2000)
                    .map(x -> x.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            mais2000.forEach(System.out::println);

            Double sum = list.stream()
                    .filter(x -> x.getName().charAt(0) == 'M')
                    .map(x -> x.getSalary())
                    .reduce(0.0, (x, y) -> x + y);

            System.out.println(sum);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();

    }
}
