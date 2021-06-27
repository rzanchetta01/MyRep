package Ex_Feitos.problemasBasicos;
//Digite 2 numeros, que o programa somae eles
import java.util.Scanner;

public class Soma{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        n1 = sc.nextInt();

        n2 = sc.nextInt();
        System.out.println("SOMA =" + (n1 + n2));

        int raio;
        raio = sc.nextInt();
        double pi = 3.14159;
        double area = pi * (raio * raio);
        System.out.println("A=" + area);

        int a, b, c, d, diferenca;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diferenca = ((a * b) - (c * d));
        System.out.println("diferença é:" + diferenca);

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