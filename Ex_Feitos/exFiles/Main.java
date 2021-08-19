/*package Ex_Feitos.exFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
       List<Produto> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        int n = 4;


        for (int i = 1; i <= n; i++) {
            System.out.println("nome, quantidade, preco ");
            String nome = sc.nextLine();
            int quantidade = sc.nextInt();
            double preco = sc.nextDouble();
            sc.nextLine();
            lista.add(new Produto(nome, quantidade, preco));
        }
        for (Produto produto : lista) {
           System.out.println(produto.oConsole()); 
        }




 
        String path = "F:\\MyRep\\exFiles\\test.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            

            for (Produto produto : lista ){
                bw.write(produto.oFile());
                bw.newLine();
            }

            
        } catch (IOException e) {
           e.getMessage();
        }
        sc.close();
    }
}*/
