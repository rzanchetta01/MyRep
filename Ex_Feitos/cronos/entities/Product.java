package Ex_Feitos.cronos.entities;

public class Product {
    
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.price= price;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}
