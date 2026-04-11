package aplication;

import entities.Funcionarios;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionarios funcionario = new Funcionarios();

        System.out.println("Digite o nome: ");
        funcionario.name = sc.nextLine();
        System.out.println("Digite o salário bruto: ");
        funcionario.GrossSalary = sc.nextDouble();
        System.out.println("Digite o imposto: ");
        funcionario.Tax = sc.nextDouble();
        System.out.println(funcionario);

        System.out.println();
        System.out.println("Digite a porcentagem de aumento: ");
        System.out.println("Dados atualizados: " + funcionario.name + "\n" + funcionario.IncreaseSalary(sc.nextDouble()));

    }
}
