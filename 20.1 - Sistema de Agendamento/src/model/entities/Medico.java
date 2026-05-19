public class Medico extends Pessoa{
    private Especialidade especialidade;
    private String crm;

    public Medico() {}
    public Medico(String nome, String cpf, String telefone, Especialidade especialidade, String crm) {
        super(nome, cpf, telefone);
        this.especialidade = especialidade;
        this.crm = crm;

    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }


}
