
/**
 * Write a description of class LaundryService here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaundryService extends PearlService
{
    private String type;
    private String clothType;
    private int quantity;
    
    public LaundryService(String cn,String i,String pn,String t,String ct,int q)
    {
        super(cn,i,pn);
        type = t;
        clothType = ct;
        quantity = q;
    }
    
    public String gettype(){return type;}
    public String getclothType(){return clothType;}
    public int getquantity(){return quantity;}
    
    public double calculateCharge()
    {
        double charge = 0.0;
        if(type.equalsIgnoreCase("Normal"))
        {
           if(clothType.equalsIgnoreCase("Wash"))
           {
               charge = quantity * 2.50;
            }
        }
        
        else if(type.equalsIgnoreCase("Dry"))
        {
            if(clothType.equalsIgnoreCase("BajuKurung") || clothType.equalsIgnoreCase("BajuMelayu"))
            {
                charge = quantity * 8.00;}
            
            else if(clothType.equalsIgnoreCase("Blazer"))
            {   charge = quantity * 10.00; }
               
            else 
            {   charge = quantity * 9.00; }
        }
        
        return charge;
    }
       
    public String toString()
    {
        return "Type "+type+clothType+quantity+super.toString();
    }
    
}
