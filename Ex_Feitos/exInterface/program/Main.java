package program;
/*
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Contract;
import entities.Instalment;
import service.ContractService;
import service.PaypalService;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

        System.out.println("enter contract data:");

        try {
            System.out.println("Number:");
            Integer number = sc.nextInt();
            System.out.println("Date:");
            Date contractDate = sdf.parse(sc.next());
            System.out.println("Contract value: ");
            Double contractValue = sc.nextDouble();

            Contract contract = new Contract(number, contractDate, contractValue);

            System.out.println("Enter number of installments: ");
            int N = sc.nextInt();
            
            ContractService cs = new ContractService(new PaypalService());

            cs.processContract(contract, N);

            System.out.println("installments: ");
            for (Instalment it : contract.getInstalments()) {
                System.out.println(it);
            }

        } catch (ParseException e) {
            e.getStackTrace();
        }

        sc.close();
    }
}
*/