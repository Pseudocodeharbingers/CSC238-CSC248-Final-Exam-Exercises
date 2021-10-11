
/**
 * Abstract class product - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class product
{
   protected String proCode;
   protected int qty;
   
   public product()
   {
       proCode = null;
       qty = 0;
   }
   
   public void setproduct(String p, int q)
   {
       proCode = p;
       qty = q;
   }
   
   public String getProCode()
   {
       return proCode;
    }
    
    public int getProQty()
   {
       return qty;
    }
}
