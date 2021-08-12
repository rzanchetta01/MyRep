package Ex_Feitos.cronos.program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Ex_Feitos.cronos.entities.Client;
import Ex_Feitos.cronos.entities.Order;
import Ex_Feitos.cronos.entities.OrderItem;
import Ex_Feitos.cronos.entities.Product;
import Ex_Feitos.cronos.entities_enum.OrderStatus;

public class Main {
    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("entre com os dados do cliente");
        System.out.print("nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.println("Data de nascimento: ");
        Date dataNascimento = sdf.parse(sc.next());

        Client cliente = new Client(nome, email, dataNascimento);

        System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, cliente);

        System.out.print("Digite a quantidade de items a adcionar no pedido: ");
        int n = sc.nextInt();
        

        for (int i = 0; i <= n; i++) {
            
            System.out.print("Nome do item: ");
            sc.nextLine();
            String nomeItem = sc.nextLine();
            System.out.print("Preço: ");
            double precoItem = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidadeItem = sc.nextInt();

            Product item = new Product(nomeItem, precoItem);
            OrderItem orderItem = new OrderItem(quantidadeItem, precoItem, item); 

            order.addItem(orderItem);
        }
        System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		sc.close();


    }
}
