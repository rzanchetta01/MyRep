package Ex_Feitos.problemasBasicos;
/*import java.util.Scanner;
import java.util.Arrays;

public class FixMatriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas");
        int m = sc.nextInt();

        System.out.println("Digite a quantidade de colunas");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int[] is : matriz) {
            System.out.println(Arrays.toString(is));
        }

        System.out.println("Digite o numero para  mostrar ao redor");
        int x = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (x == matriz[i][j]) {

                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i - 1][j]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Down: " + matriz[i + 1][j]);
                    }
                }

            }
        }

        sc.close();
    }
}
*/