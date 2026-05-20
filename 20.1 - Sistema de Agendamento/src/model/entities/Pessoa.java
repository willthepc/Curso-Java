import java.util.ArrayList;
import java.util.Scanner;

abstract class Pessoa {
    private String name;
    private String cpf;
    private String telefone;

    public Pessoa() {}
    public Pessoa(String name, String cpf, String telefone) {
        this.name = name;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}


