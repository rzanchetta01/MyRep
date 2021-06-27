package Ex_Feitos.problemasBasicos;
import java.util.Scanner;

//conta quantos tem dentro/quantos tem fora

public class Compara {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n ;
        n = sc.nextInt();
        int in=0;
        int out=0;


        for (int i = 1; i <= n; i++) {

            int z;

            z=sc.nextInt();
            if(z==10||z==11||z==12||z==13||z==14||z==15||z==16||z==17||z==18||z==19||z==20){
                in = in + 1;
            }else{
                out = out +1;
            }
            
        }
        System.out.println(in+"in\n"+out+"out");

        sc.close();
    }
}
