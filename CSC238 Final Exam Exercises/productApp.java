
/**
 * Write a description of class productfak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class productApp
{
    public static void main(String args[])
    {
        product [] p = new product [2];
     
        Scanner s = new Scanner(System.in);
        
        for(int i = 0; i < p.length ; i++)
        {
            System.out.print("Enter product code :");
            String pro = s.next();
            
            System.out.print("Enter quantity :");
            int qty = s.nextInt();
            
            System.out.print(" Foods or Washing Machine :");
            String r = s.next();
            
            if(r.equalsIgnoreCase("Foods") )//normal constructor
            {
                 System.out.print(" Expiration date :");
                 String k = s.next();
                 
                 p[i] = new Foods(pro,qty,k);
            }    
            
            else if(r.equalsIgnoreCase("Wm"))
            {
                 System.out.print(" Enter Capacity :");
                 int o = s.nextInt();
               p[i] = new WashingMachine(pro,qty,o);
            } 
        }
   
            
    for(int j=0;j<p.length;j++)
    {
     
        if(p[j] instanceof Foods)
        {
            Foods f = (Foods)p[j]; // use subclass operator to make sure p[j] point to an object of subclass foods
     
            String a = f. getexpdate().substring(3);
            
            if(a.equals("10/2016"))
            {
                System.out.println(p[j].getProCode()+p[j].getProQty());
            }
        }
     
      }
      
     for(int k=0;k<p.length;k++)
    {
     
        if(p[k] instanceof WashingMachine)
        {
            WashingMachine w = (WashingMachine)p[k]; // use subclass operator to make sure p[j] point to an object of subclass foods
            int c = w.getCapacity();
            if(c>10)
            {
                System.out.println(p[k].getProCode()+p[k].getProQty());
            }
        }
     
      }
    }
}
