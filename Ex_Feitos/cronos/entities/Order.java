/*package Ex_Feitos.cronos.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Ex_Feitos.cronos.entities_enum.OrderStatus;


public class Order {

    private Client client;
    private Date moment;
    private OrderStatus status;

    private List<OrderItem> lists = new ArrayList<>();
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem list){
       this.lists.add(list);
    }
    public void removeItem(OrderItem list){
        this.lists.remove(list);
    }
    public Double total(){
        double sum = 0.0;

       for (OrderItem list : lists) {
            sum += list.subtotal();
       }
        return sum;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment)+"\n");

        sb.append("Order status: ");
        sb.append(status + "\n");

        sb.append("Client: ");
        sb.append(client + "\n");

        sb.append("Order items ");
        for (OrderItem list : lists) {
            sb.append(list + "\n");
        }
        sb.append("Total price: ");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
        
    }
    
}*/