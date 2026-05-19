import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoService {
    private static String pathPessoas = "C:\\temp\\Pessoas.txt";
    private static String pathMedicos = "C:\\temp\\Medicos.txt";
    private static String pathConsultas = "C:\\temp\\Consultas.txt";
    public static void salvarCliente(Cliente cliente) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathPessoas, true))) {
            bw.write(cliente.getName() + ","
                    + cliente.getCpf() + ","
                    + cliente.getTelefone() + ","
                    + cliente.getObersavacoesMedicas());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao salvar no arquivo: " + e.getMessage());
        }
    }

    public static void salvarMedico(Medico medico) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathMedicos, true))) {
            bw.write(medico.getName() + ","
                    + medico.getCpf() + ","
                    + medico.getTelefone() + ","
                    + medico.getEspecialidade() + ","
                    + medico.getCrm());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao salvar no arquivo: " + e.getMessage());
        }
    }

    public static void salvarConsulta(String cpf, String especialidade, String dataHora) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathConsultas, true))) {
            bw.write(cpf + "," + especialidade + "," + dataHora);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao salvar consulta: " + e.getMessage());
        }
    }
}