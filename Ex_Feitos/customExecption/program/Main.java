package program;
/*

import java.util.Scanner;
import model.execptions.BankExecptions;
import model.entities.Account;

public class Main {
    public static void main(String[] args) throws BankExecptions {
       
        Scanner sc1 = new Scanner(System.in);

       
            System.out.println("Digite os dados de sua conta bancaria");

            System.out.print("nome: ");
            String name = sc1.nextLine();
            System.out.print("numero da conta: ");
            int nAcc = sc1.nextInt();
            System.out.print("saldo: ");
            double balance = sc1.nextDouble();
            System.out.print("saque limite: ");
            double withdraw = sc1.nextDouble();
            Account acc1 = new Account(nAcc, name, balance, withdraw);
            System.out.print("\n");
    
            System.out.println(acc1.toString());
    
            System.out.print("\n\n\n");
            System.out.println("s para sacar d para depositar");
            char decision = sc1.next().charAt(0);
            double amount;
            
            if (decision == 'd') {
                System.out.print("Digite o quanto deseja depositar: ");
                amount = sc1.nextDouble();
                acc1.deposit(amount);
                System.out.print("\n\n\n");
                System.out.println("deposito feito com sucesso, seu saldo agora é de:" + acc1.getBalance());
            }
            try {
                if (decision == 's') {
                    System.out.print("Digite o quanto deseja sacar, seu limite é de: "+ acc1.getWithdrawLimit() + " ");
                    amount = sc1.nextDouble();
                    acc1.withdraw(amount);
                    System.out.print("\n\n\n");
                    System.out.println("saque feito com sucesso, seu saldo agora é de:" + acc1.getBalance() + " ");
                }
            } catch (BankExecptions eBankExecptions) {
                System.out.println(eBankExecptions.getMessage());
            }
        
        
            
       

        sc1.close();
    }
}*/
