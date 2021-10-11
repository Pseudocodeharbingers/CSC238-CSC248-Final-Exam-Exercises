
/**
 * Write a description of class UmrahApplicant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UmrahApplicant extends  EZTravelApplicant
{
   private char up;
   
   public UmrahApplicant(String n,String i,char f,double d,char r)
   {
       super(n,i,f,d);
       up = r;
    }
 
   public double calculateCharge()
   {
     
       double total = 0.0;
       
       if(up == '1')
       {
          total = 8000;
       }
       
       else if(up == '2' )
       {
          total = 9000;
       }
      
       else 
       {
          total = 10000;
       }
       
       return total;
       
    }
}


