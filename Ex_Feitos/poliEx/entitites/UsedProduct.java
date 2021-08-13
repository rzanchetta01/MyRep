/*package entitites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    
    private Date manufactureDate;
    private static SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy");

    public UsedProduct(String name, Double price, Date manufDate) {
        super(name, price);
        this.manufactureDate = manufDate;
    }


    public Date getManufactureDate() {
        return manufactureDate;
    }
    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }


    @Override
    public String priceTag(){


        return getName() 
        + " (used) $ " 
        + String.format("%.2f", getPrice())
        + " (Manufacture date: "
        + s1.format(manufactureDate)
        + ")";
    }
}*/
