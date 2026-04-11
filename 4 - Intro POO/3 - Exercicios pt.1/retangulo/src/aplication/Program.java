package aplication;

import entities.Retangulo;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Entre com a largura do retângulo: ");
        retangulo.Width = sc.nextDouble();
        System.out.println("Entre com a altura do retângulo: ");
        retangulo.Height = sc.nextDouble();

        System.out.println("Área = " + retangulo.Area());
        System.out.println("Perímetro = " + retangulo.Perimeter());
        System.out.println("Diagonal = " + retangulo.Diagonal());

    }
}
