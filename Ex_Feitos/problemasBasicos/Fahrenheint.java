package Ex_Feitos.problemasBasicos;
import java.util.Scanner;

//calculo de celsius para fahrenheit

public class Fahrenheint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double celsius;
        double faren;
        char step;

        System.out.println("digite graus em celsius: ");
        celsius = sc.nextDouble();

        do {
            faren = ((9.0 * celsius) / 5) + 32;
            System.out.println("Equivalente em Fahrenheit: " + faren);
            System.out.println("Deseja continuar? s/n");
            step = sc.next().charAt(0);
        } while (step != 'n');

        sc.close();
    }
}
