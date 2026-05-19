import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Cliente cliente;
        Medico medico;
        Integer pass = 1234;
        String pathPessoas = "C:\\temp\\Pessoas.txt";
        String pathMedicos = "C:\\temp\\Medicos.txt";
        String pathConsultas = "C:\\temp\\Consultas.txt";

        Integer opt;
        do {

            System.out.println(
                    "==========================\nESCOLHA UMA DAS OPÇÕES\n==========================" +
                            "\n1 - CADASTRAR CLIENTE\n" +
                            "2 - CADASTRAR MÉDICO\n" +
                            "3 - MARCAR CONSULTA\n" +
                            "4 - LISTAR CLIENTES / MÉDICOS / CONSULTAS\n" +
                            "999 - FINALIZAR PROGRAMA\n"
            );

            opt = sc.nextInt();
            if (opt.equals(1)) {
                    System.out.println("Digite seu nome: ");
                    String nome = sc.next();
                    System.out.println("Digite seu CPF: ");
                    String cpf = sc.next();
                    System.out.println("Digite seu telefone: ");
                    String telefone = sc.next();
                    System.out.println("Digite oberservações: ");
                    String observacoesMedicas = sc.next();

                    cliente = new Cliente(nome, cpf, telefone, observacoesMedicas);

                    ArquivoService.salvarCliente(cliente);
                    System.out.println("Cliente cadastrado com sucesso!");

            } else if (opt.equals(2)) {
                System.out.println("Senha: ");
                Integer senhaUser = sc.nextInt();

                if (senhaUser.equals(pass)) {
                    System.out.println("Digite seu nome: ");
                    String nome = sc.next();

                    System.out.println("Digite seu CPF: ");
                    String cpf = sc.next();

                    System.out.println("Digite seu telefone: ");
                    String telefone = sc.next();

                    System.out.println("Qual sua especialidade (ex: cardiologista, clinicogeral): ");
                    String especialidadeDigitada = sc.next().toUpperCase();

                    if (especialidadeDigitada.equals("CLINICOGERAL")) {
                        especialidadeDigitada = "CLINICO_GERAL";
                    }

                    Especialidade especialidade = null;
                    try {
                        especialidade = Especialidade.valueOf(especialidadeDigitada);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Nossa clínica não atende a esse serviço.");
                        continue;
                    }

                    System.out.println("Qual seu CRM: ");
                    String crm = sc.next();

                    medico = new Medico(nome, cpf, telefone, especialidade, crm);

                    ArquivoService.salvarMedico(medico);
                    System.out.println("Médico cadastrado com sucesso!");

                } else {
                    System.out.println("Senha incorreta...");
                }

            } else if (opt.equals(3)) {
                System.out.println("Digite seu CPF: ");
                String cpfConsulta = sc.next();

                boolean clienteExiste = false;
                boolean especialidadeExiste = false;

                    try (Stream<String> stream = Files.lines(Paths.get(pathPessoas))) {
                        clienteExiste = stream.anyMatch(linha -> linha.split(",")[1]
                                .equals(cpfConsulta));
                    } catch (IOException e) {
                        System.out.println("Erro ao ler clientes: " + e.getMessage());
                    }

                    if (clienteExiste) {
                        System.out.println("Cliente encontrado! Especialidade desejada: ");
                        String especialidadeDesejada = sc.next().toUpperCase();

                        if (especialidadeDesejada.equals("CLINICOGERAL")) {
                        especialidadeDesejada = "CLINICO_GERAL";
                    }

                    Especialidade especialidade = null;
                    try {
                        especialidade = Especialidade.valueOf(especialidadeDigitada);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Nossa clínica não atende a esse serviço.");
                        continue;
                    }
                        try (Stream<String> stream = Files.lines(Paths.get(pathMedicos))) {
                            String finalEspecialidadeDesejada = especialidadeDesejada;
                            especialidadeExiste = stream.anyMatch(linha -> linha.split(",")[3]
                                    .equals(finalEspecialidadeDesejada));
                        } catch (IOException e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                        if (especialidadeExiste) {
                            System.out.println("Escolha uma data e horário:");
                            System.out.println("Formato: Dia/Mês/Ano Horário");

                            sc.nextLine();
                            String horarioData = sc.nextLine();

                            LocalDateTime dataHoraDaConsulta = LocalDateTime.parse(horarioData, formatter);
                            System.out.println(dataHoraDaConsulta.format(formatter));

                            ArquivoService.salvarConsulta(cpfConsulta, especialidadeDesejada, dataHoraDaConsulta.format(formatter));
                            System.out.println("Consulta marcada com sucesso!");
                        } else {
                            System.out.println("Especialidade não dísponivel na nossa clínica...");
                        }
                    } else {
                        System.out.println("Cliente não encontrado...");
                    }



                } else if (opt.equals(4)) {
                    System.out.println("============= CLIENTES CADASTRADOS =============");
                    try (Stream<String> stream = Files.lines(Paths.get(pathPessoas))) {
                        stream.filter(linha -> linha.contains(","))
                                .map(linha -> {
                                    String[] dados = linha.split(",");
                                    return String.format("Nome: %-15s | CPF: %-14s | Tel: %-12s | Obs: %s",
                                            dados[0], dados[1], dados[2], dados[3]);
                                })
                                .forEach(System.out::println);
                    } catch (IOException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }

                    System.out.println("============= MÉDICOS CADASTRADOS =============");
                    try (Stream<String> stream = Files.lines(Paths.get(pathMedicos))) {
                        stream.filter(linha -> linha.contains(","))
                                .map(linha -> {
                                    String[] dados = linha.split(",");
                                    return String.format("Nome: %-15s | CPF: %-14s | Tel: %-12s | Esp: %-12s | CRM: %-12s", dados[0], dados[1], dados[2], dados[3], dados[4]);
                                })
                                .forEach(System.out::println);
                    } catch (IOException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }

                    System.out.println("============= CONSULTAS MARCADAS =============");
                    try (Stream<String> stream = Files.lines(Paths.get(pathConsultas))) {
                        stream.filter(linha -> linha.contains(","))
                                .map(linha -> {
                                    String[] dados = linha.split(",");
                                    return String.format("CPF: %-14s | Consulta: %-12s | Data e Hora: %-12s", dados[0], dados[1], dados[2]);
                                })
                                .forEach(System.out::println);
                    } catch (IOException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }


                } else if (opt.equals(999)) {
                    System.out.println("Programa encerrando...");
                    break;
                } else {
                    System.out.println("Option unknown.");
                }


        } while (!opt.equals(999));
    }
}
