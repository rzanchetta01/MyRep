package Ex_Feitos.problemasBasicos;
import java.util.Scanner;

//Digite 4 numeros e ele faz uma conta de diferenca

public class Diferenca{

    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        int a, b, c, d, diferenca;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diferenca = ((a * b) - (c * d));
        System.out.println("diferença é:" + diferenca);

        sc.close();
    }
}
