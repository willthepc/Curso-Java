public class Cliente extends Pessoa{
    private String observacoesMedicas;

    public Cliente() {}
    public Cliente(String nome, String cpf, String telefone, String observacoesMedicas) {
        this.observacoesMedicas = observacoesMedicas;
        super(nome, cpf, telefone);
    }

    public String getObersavacoesMedicas() {
        return observacoesMedicas;
    }

    public void setHistoricoMedico(String obersavacoesMedicas) {
        this.observacoesMedicas = observacoesMedicas;
    }
}
