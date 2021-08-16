package Ex_Feitos.abs.program;
/*package abs.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import abs.entities.Pessoa;
import abs.entities.pFisica;
import abs.entities.pJrudica;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Quantas pessoas deseja registrar?");
        int n = sc.nextInt();
        List<Pessoa> products = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            
            System.out.println("F para fisica ou J para juridica");
            char tipPessoa = sc.next().charAt(0);

            if(tipPessoa =='f'){
                sc.nextLine();
                System.out.println("Nome");
                String nome = sc.nextLine();
                System.out.println("Renda anual");
                Double renAnual = sc.nextDouble();
                System.out.println("Gasto com saude");
                Double gastoSaude = sc.nextDouble();
                products.add(new pFisica(gastoSaude, nome, renAnual));

            }else{
                sc.nextLine();
                System.out.println("Nome");
                String nome = sc.nextLine();
                System.out.println("Renda anual");
                Double renAnual = sc.nextDouble();
                System.out.println("Numero de funcionarios");
                int numFuncionario = sc.nextInt();
                products.add(new pJrudica(numFuncionario, nome, renAnual));
            }
        }

        for (Pessoa nome : products) {
            System.out.println(nome.toString());
        }
        
        sc.close();
    }
}
*/