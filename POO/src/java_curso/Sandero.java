package java_curso;

public class Sandero implements Carro{

    final int limiteVelocidade = 150;

    public int velocidadeAtual = 0;

    @Override
    public void acelerar() {
        if(this.velocidadeAtual < this.limiteVelocidade) {
            this.velocidadeAtual += 20;
        }
            System.out.println(this.velocidadeAtual);
    }

    @Override
    public void freiar() {

    }

    @Override
    public void parar() {

    }
}
