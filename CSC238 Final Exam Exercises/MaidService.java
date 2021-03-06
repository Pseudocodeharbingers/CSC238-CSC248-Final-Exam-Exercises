
/**
 * Write a description of class MaidService here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MaidService extends PearlService
{
   private char dailyMaidPackage;
   private int numOfDays;
   
   public MaidService(String cn,String i,String pn,char dm,int nd)
   {
       super(cn,i,pn);
       dailyMaidPackage = dm ;
       numOfDays = nd ;
   }
   
   public char getdmp(){return dailyMaidPackage;}
   public int getnod(){return numOfDays;}
   
   public double calculateCharge()
   {
       double charge = 0.0;
       if(dailyMaidPackage == 'a' || dailyMaidPackage == 'A')
       {
           charge = 60.00 * numOfDays;
       }
       
       else if(dailyMaidPackage == 'b' || dailyMaidPackage == 'B')
       {
           charge = 110.00 * numOfDays;      
       }
       
       return charge;
    }     
  
}
