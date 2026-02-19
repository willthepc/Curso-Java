package aula140.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aula140.entities.Employee;
import aula140.entities.OutsourcedEmployee;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> listaEmployee = new ArrayList<>();

        System.out.println("Enter the numbers of employees: ");
        int qtd = sc.nextInt();

        for (int i = 1; qtd >= i; i ++) {
            System.out.println("Employee #" + i + " data: ");
            System.out.println("Outsourced(y/n)?");
            String str = sc.next();
            if (str.equals("n")) {
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Hours: ");
                int hours = sc.nextInt();
                System.out.println("Value per hour: ");
                Double valuePerHour = sc.nextDouble();
                Employee employee = new Employee(name, hours, valuePerHour);
                listaEmployee.add(employee);
            } else {
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Hours: ");
                int hours = sc.nextInt();
                System.out.println("Value per hour: ");
                Double valuePerHour = sc.nextDouble();
                System.out.println("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                listaEmployee.add(employee);
            }
        }

        for (Employee i : listaEmployee) {
            System.out.println(i.getName() + " - $ " + i.payment());
        }

    }
}
