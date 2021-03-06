
/**
 * Write a description of class PearlServiceApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PearlServiceApp
{
   public static void main(String args[])
   {
       PearlService customers [] = new PearlService[2];
       Scanner s = new Scanner(System.in);
       
       for(int i = 0; i<customers.length; i++)
       {
           System.out.print("Enter name :");
           String n = s.next();
           
           System.out.print("Enter IC :");
           String ic = s.next();
           
           System.out.print("Enter phone number :");
           String pn = s.next();
           
           System.out.print("Enter service 1 - Maid service  OR 2 - Laundry Service : ");
           char sv = s.next().charAt(0);
           
           if(sv == '1')
           {
                 System.out.print("Enter package A or B : ");
                 char pe = s.next().charAt(0);
                 
                 System.out.print("Enter number of days : ");
                 int day = s.nextInt();
                 
                 customers[i] = new MaidService(n,ic,pn,pe,day);
           }
           else if(sv == '2')
           {
                 System.out.print("Enter type : ");
                 String ty = s.next();
                 System.out.print("Enter cloth type : ");
                 String ct = s.next();
                 System.out.print("Enter quantity : ");
                 int qty = s.nextInt();
                 
                 customers[i] = new LaundryService(n,ic,pn,ty,ct,qty);
           }
        }
             
        double total = 0.0, total2 = 0.0;
        
        for(int j = 0 ; j<customers.length; j++)
        {
          if(customers[j] instanceof LaundryService)
          {
            LaundryService ls = (LaundryService) customers[j];
            double charge = ls.calculateCharge();
            if(ls.gettype().equalsIgnoreCase("Dry"))
            {
                total += charge;
                System.out.println(ls.toString());
            }
          }
          
          else if(customers[j] instanceof MaidService)
          {
            MaidService ms = (MaidService) customers[j];
            double charge = ms.calculateCharge();
            
            System.out.println(customers[j].toString()+ms.getdmp()+ms.getnod()+charge);
         
          }
        }
        
        System.out.println(total);
    }       
}
