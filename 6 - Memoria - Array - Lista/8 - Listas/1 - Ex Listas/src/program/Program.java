package program;

import entities.Employees;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employees> listEmployees = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println("ID:");
            Integer id = sc.nextInt();

            System.out.println("NAME:");
            String name = sc.next();

            System.out.println("SALARY:");
            Double salary = sc.nextDouble();
            System.out.println();

            Employees employees = new Employees(id, name, salary);
            listEmployees.add(employees);

        }

        System.out.println("Enter the employee id that will have salary increase:");
        int id = sc.nextInt();

        System.out.println("Enter the percentage:");
        Double percentage = sc.nextDouble();

        for(Employees i : listEmployees) {
            if (i.getId() == id) {
                i.setSalary(i.getSalary() + ((i.getSalary() * percentage) / 100));
                break;
            }
        }
        for (Employees y : listEmployees) {
            System.out.println(y);
        }

    }
}
