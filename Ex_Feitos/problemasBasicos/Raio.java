package Ex_Feitos.problemasBasicos;
//digita o raio e ele te da a area do circulo
import java.util.Scanner;

public class Raio {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int raio;
        raio = sc.nextInt();
        double pi = 3.14159;
        double area = pi * (raio * raio);
        System.out.println("A=" + area);
        sc.close();
    }
}
