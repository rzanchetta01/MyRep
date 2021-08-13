/*package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import entitites.ImportedProduct;
import entitites.Product;
import entitites.UsedProduct;

import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc= new Scanner(System.in);
        SimpleDateFormat s2 = new SimpleDateFormat("dd/MM/yyyy");

        

        System.out.print("Enter quantity of products: ");
        int nProduct = sc.nextInt();
        List<Product> products = new ArrayList<>();
        

        for (int i = 1; i <= nProduct; i++) {
            
            System.out.print("Common, used or imported(c/u/i)?");
            char cui = sc.next().charAt(0);
            System.out.println("product "+i+": ");
            if(cui == 'i'){
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Customs fee: ");
                Double cFee = sc.nextDouble();

                products.add(new ImportedProduct(name, price, cFee));
            }
            else if(cui == 'u'){
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Manufacture date(DD/MM/YYYY: ");
                
                Date mDate = s2.parse(sc.next());
               

                products.add(new UsedProduct(name, price, mDate));
            }
            else{
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();

                products.add(new Product(name, price));
            }
        System.out.println();
        System.out.println("PRICE TAGS:"); 
        }
        for (Product product : products) {
            System.out.println(product.priceTag());
        }
        






        sc.close();
    }
}*/
