package alunos;

import entities.Alunos;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Alunos aluno = new Alunos();
        System.out.println("Digite seu nome: ");
        aluno.name = sc.nextLine();
        while (true) {
            System.out.println("NOTAS MÁXIMAS\n\nPRIMEIRO SEMESTRE: 30\nSEGUNDO SEMESTRE: 35\nTERCEIRO SEMESTRE: 35");

            System.out.println("Digite a primeira nota: ");
            aluno.priSemestre = sc.nextDouble();
            if(aluno.priSemestre > 30.0) {
                System.out.println("Nota máxima: 30.0");
                break;
            }

            System.out.println("Digite a segunda nota: ");
            aluno.segSemestre = sc.nextDouble();
            if(aluno.segSemestre > 35.0) {
                System.out.println("Nota máxima: 35.0");
                break;
            }

            System.out.println("Digite a terceira nota: ");
            aluno.terSemestre = sc.nextDouble();
            if(aluno.terSemestre > 35.0) {
                System.out.println("Nota máxima: 35.0");
                break;
            }


            System.out.println(aluno.avaliar());
            break;
        }


    }
}
