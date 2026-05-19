import java.time.LocalDateTime;

public class Consulta {
    private Cliente cliente;
    private Medico medico;
    private LocalDateTime dataHora;
    private StatusAgendamento status;

    public Consulta() {}

    public Consulta(Cliente cliente, Medico medico, LocalDateTime dataHora, StatusAgendamento status) {
        this.cliente = cliente;
        this.medico = medico;
        this.dataHora = dataHora;
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public StatusAgendamento getStatus() {
        return status;
    }

    public void setStatus(StatusAgendamento status) {
        this.status = status;
    }
}