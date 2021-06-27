package Ex_Feitos.problemasBasicos;
import java.util.Scanner;

//ve com base nas cordenas qual quadrante do plano cartesiano

public class Cartesiano {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0 & y != 0) {
            if (x > 0 & y > 0) {
                System.out.println("primeiro");
                x = sc.nextInt();
                y = sc.nextInt();
            }
            if (x < 0 & y < 0) {
                System.out.println("terceiro");
                x = sc.nextInt();
                y = sc.nextInt();
            }
            if (x < 0 & y > 0) {
                System.out.println("segundo");
                x = sc.nextInt();
                y = sc.nextInt();
            }
            if (x > 0 & y < 0) {
                System.out.println("quarto");
                x = sc.nextInt();
                y = sc.nextInt();
            }
        }
        sc.close();
    }
}
