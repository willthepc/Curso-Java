package entities;

public class Alunos {
    public String name;
    public double priSemestre;
    public double segSemestre;
    public double terSemestre;

    public String avaliar() {
        double notaFinal = priSemestre + segSemestre + terSemestre;

        if(notaFinal > 60.0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED\nFALTARAM " + (notaFinal - 60.0) + " PONTOS");
        }

        return "NOME: " + name + "\nNOTA FINAL: " + notaFinal;

    }
}
