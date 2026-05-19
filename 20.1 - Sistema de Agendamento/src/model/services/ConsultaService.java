public class ConsultaService {
    public void validarAgendamento(boolean clienteExiste, boolean especialidadeExiste) {
        if (!clienteExiste) {
            throw new DomainException("CPF não cadastrado na nossa base de dados.");
        }

        if (!especialidadeExiste) {
            throw new DomainException("Especialidade não disponível na nossa clínica.");
        }
    }
}