
/**
 * Write a description of class Foods here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Foods extends product
{
   private String ed;
   
   public Foods()
   {
       super();
       ed = null;
    }
    
    
   public Foods(String p,int q,String e)
   {
       super.setproduct(p,q);
       ed = e;
   }
   
   public String getexpdate()
   {
      return ed;
    }
}
