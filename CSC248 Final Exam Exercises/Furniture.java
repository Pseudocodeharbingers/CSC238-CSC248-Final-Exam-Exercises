
/**
 * Write a description of class Furniture here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Furniture
{
   private String fCode;
   private String manufacturer;
   private double price;
   private String paymentMode;
   private String design;
   
   public Furniture(String f, String m, double p, String pm, String d)
   {
       fCode = f;
       manufacturer = m;
       price = p;
       paymentMode = pm;
       design = d;
   }
   
   public String getFCode(){return fCode; }
   public String getManufacturer(){return manufacturer; }
   public double getPrice(){return price; }
   public String getMode(){return paymentMode; }
   public String getDesign(){return design; }
}
