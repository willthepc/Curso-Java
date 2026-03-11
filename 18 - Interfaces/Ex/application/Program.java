import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite o número: ");
        int number = sc.nextInt();

        System.out.println("Digite a data: ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);

        System.out.println("Valor do contrato: ");
        Double totalValue = sc.nextDouble();

        Contract obj = new Contract(number, date, totalValue);

        System.out.println("Entre com o número de parcelas: ");
        Double amount = sc.nextDouble();

        ContractService contractService = new ContractService(new PayPalService());

        contractService.processContract(obj, amount);

        System.out.println("Parcelas: ");
        for (Installment installment : obj.getInstallment()) {
            System.out.println(installment);
        }


    }
}
