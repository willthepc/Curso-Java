package java_curso;

// public -> acessivel pra qualquer lugar
// default -> ao nao definir fica esse daqui
// private -> acessivel apenas dentro da classe
// protected -> acessivel por todos que esta no mesmo pacote


public class classes {
    public static void main(String[] args) {
    Carro meuCarro = new Sandero();
    Carro meuCarro2 = new Mobi();

    SerVivo meuSer = new Humano();
    meuSer.respirar();

    meuCarro.acelerar();
    meuCarro2.acelerar();
    meuCarro.acelerar();
    meuCarro.acelerar();
    meuCarro.acelerar();
    meuCarro.acelerar();
    meuCarro.acelerar();
    meuCarro.acelerar();
    meuCarro.acelerar();
    meuCarro.acelerar();
    meuCarro.acelerar();
    meuCarro.acelerar();
    meuCarro.acelerar();
    meuCarro.acelerar();
    }
}



