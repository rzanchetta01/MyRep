package Ex_Feitos.execoes1.program;
/*packagEx_Feitos.execoes1.programam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import execoes1.entitites.Reservation;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            try {
                System.out.println("Room number: ");
                int number = sc.nextInt();

                System.out.println("check in:");
                Date checkIn = sdf.parse(sc.next());

                System.out.println("check out:");
                Date checkOut = sdf.parse(sc.next());

                Reservation r1 = new Reservation(number, checkIn, checkOut);
                System.out.print("\n\n\n");

                System.out.println("Enter data to update: ");
                System.out.println("check in:");
                checkIn = sdf.parse(sc.next());

                System.out.println("check out:");
                checkOut = sdf.parse(sc.next());

                r1.updateDates(checkIn, checkOut);

            } 
            catch (ParseException parseException) {
                System.out.println("Invalid date");
            }
            catch (IllegalArgumentException illegalArgumentException){
                System.out.println("Illegal Argument Exeception:" + illegalArgumentException.getMessage());
            }

        

        sc.close();
    }
}*/
