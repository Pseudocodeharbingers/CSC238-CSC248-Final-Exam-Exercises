
/**
 * Write a description of class MobilePhone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MobilePhone extends Gadget
{
   private String modelName;
   private double screenSize;
   private double discountPercent;
   
   public MobilePhone(String b,double p,String mn,double ss,double dp)
   {
       super(b,p);
       modelName = mn;
       screenSize = ss;
       discountPercent = dp;
   }
   
   public String getmodelName(){ return modelName;}
   public double getscreenSize(){ return screenSize;}
   public double getdiscountPercent(){ return discountPercent;}
   
   public double calculatePrice()
   {
       double newprice = super.getPrice() - (super.getPrice()*discountPercent);   
       return newprice;
    }
       
       
   
}
