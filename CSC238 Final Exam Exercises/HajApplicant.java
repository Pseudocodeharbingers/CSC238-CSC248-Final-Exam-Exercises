
/**
 * Write a description of class HajApplicant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HajApplicant extends EZTravelApplicant
{
   private boolean ft;
   private char room;
   
   public HajApplicant(String n,String i,char f,double d,boolean t,char r)
   {
       super(n,i,f,d);
       ft = t;
       room = r;
    }
    
   public double calculateCharge()
   {
     
       double total = 0.0;
       
       if(room == 'a' || room == 'a')
       {
          total = 13000;
       }
       
       else if(room =='b' || room == 'b')
       {
          total = 12000;
       }
      
       else 
       {
          total = 11000;
       }
       
       return total;
       
    }
}
