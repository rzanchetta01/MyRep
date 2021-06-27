package Ex_Feitos.problemasBasicos;
import java.util.Scanner;

//calcula lado do triango e em seguida calcula umas parada

public class CalAreaTri {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("digite os lados do triango A: ");
        double lTriA1;
        double lTriA2;
        double lTriA3;
        lTriA1 = sc.nextDouble();
        lTriA2 = sc.nextDouble();
        lTriA3 = sc.nextDouble();
        System.out.println("digite os lados do triango B: ");
        double lTriB1;
        double lTriB2;
        double lTriB3;
        lTriB1 = sc.nextDouble();
        lTriB2 = sc.nextDouble();
        lTriB3 = sc.nextDouble();

        double resultado = calArea(lTriA1, lTriA2, lTriA3);
        mostrarArea(resultado);
        double resultado2 = calArea(lTriB1, lTriB2, lTriB3);
        mostrarArea(resultado2);
        calMaior(resultado, resultado2);
        sc.close();
    }

    public static double calArea(double lTri1, double lTri2, double lTri3) {
        double perimetro = (lTri1 + lTri2 + lTri3) / 2;
        double area;
        area = Math.pow(perimetro * (perimetro - lTri1) * (perimetro - lTri2) * (perimetro - lTri3), 0.5);
        return area;
    }

    public static void mostrarArea(double res) {
        System.out.println("Resultado da area:" + res);
    }

    public static void calMaior(double areaTri1, double areaTri2) {
        if (areaTri1 > areaTri2) {
            System.out.println("Triangulo A é maior");
        } else {
            System.out.println("Triangulo B é maior");
        }
        
    }
}







