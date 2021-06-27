package Ex_Feitos.problemasBasicos;
import java.util.Scanner;

//digita os dados e ele calcula o salario

public class Salario {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    int nFunc;
    int nHoras;
    double vHoras;
    double soma;

    nFunc = sc.nextInt();
    nHoras = sc.nextInt();
    vHoras = sc.nextDouble();

    soma = nHoras * vHoras;

    System.out.println("NUMEBER =" + nFunc + "\nSALARY =" + soma);
    sc.close();
    }   
}
