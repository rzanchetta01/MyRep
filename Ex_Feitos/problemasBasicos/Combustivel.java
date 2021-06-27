package Ex_Feitos.problemasBasicos;


//calcula quantidade de combustivel

import java.util.Scanner;

public class Combustivel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cod;
        int Gasolina = 0;
        int Diesel = 0;
        int Alcool = 0;
        System.out.println("1.Álcool 2.Gasolina 3.Diesel 4.Fim");
        cod = sc.nextInt();

        while (cod != 4) {

            switch (cod) {
                case 1:
                    Alcool = Alcool + 1;
                    cod = sc.nextInt();

                    break;
                case 2:
                    Gasolina = Gasolina + 1;
                    cod = sc.nextInt();

                    break;
                case 3:
                    Diesel = Diesel + 1;
                    cod = sc.nextInt();

                    break;

                default:
                    cod = sc.nextInt();
                    break;
            }
        }
        System.out.println(
                "MUITO OBRIGADO\n\n" + "Alcool: " + Alcool + "\nGasolina: " + Gasolina + "\nDiesel: " + Diesel);

        sc.close();
    }

}
