
/**
 * Write a description of class Gadget here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gadget
{
    private String brand;
    private double price;
    
    public Gadget(String b,double p)
    {
        brand = b;
        price = p;
    }
    
    public String getBrand(){return brand;}
    public double getPrice(){return price;}
    
    public String toString()
    {
        return "Brand : "+brand+"Price : "+price;
    }
    
    public double calculatePrice() {return price;}
    
}
