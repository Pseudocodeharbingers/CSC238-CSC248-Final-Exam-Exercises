
/**
 * Write a description of class Games here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Games
{
   protected String gn;
   protected String category;
   protected String gt;
   
   public Games(String g,String c,String t)
   {
      gn = g ;
      category = c ;
      gt = t;
   }
   
   public String toString()
   {
       return "game name : "+gn+category+gt;
   }
   
   public double fee()
   {
       double registration = 20.00;
       return registration;
      
    }
}
