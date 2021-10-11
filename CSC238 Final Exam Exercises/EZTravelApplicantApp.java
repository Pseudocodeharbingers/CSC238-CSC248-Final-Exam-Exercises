
/**
 * Write a description of class EZTravelApplicantApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class EZTravelApplicantApp
{
    public static void main(String args[])
    {
        EZTravelApplicant ez [] = new EZTravelApplicant [2];
        int az[] = new int[10];
        Scanner s = new Scanner (System.in);
       
        
        for(int i=0 ; i<ez.length ; i++)
         {
             System.out.print( " Name : " );
             String n = s.next();
             
             System.out.print( " Ic : " );
             String w = s.next();
             
             System.out.print( " Flight : " );
             String ff = s.next();
             char f = ff.charAt(0);
             
             System.out.print( " Deposit : RM " );
             Double d= s.nextDouble();
            
             System.out.print( "a-Haji or b-Umrah : " );
             char ch = s.next().charAt(0);
             
             if(ch == 'b')
             {
                  System.out.println( " Package : " );
                  String pp = s.next();
                  char p = pp.charAt(0);
                  
                  ez[i] = new UmrahApplicant(n,w,f,d,p);
     
             }
             
              else if(ch == 'a')
             {
                  System.out.println( " 1st time : " );
                  boolean v = s.nextBoolean();
                  
                  System.out.println( " room : " );
                  String xx = s.next();
                  char x = xx.charAt(0);
                  
                  ez[i] = new HajApplicant(n,w,f,d,v,x);
         
             }
             
        }
        
         for(int j =0;j<ez.length;j++)
        {   
            if(ez[j] instanceof UmrahApplicant)
            {
                UmrahApplicant ua = (UmrahApplicant)ez[j];
                System.out.print(ez[j].getName());
            }
        }
        
        System.out.print("Enter IC number :");
        String searchIc = s.next();
        for(int k=0; k<ez.length;k++)
        {
            if(searchIc == ez[k].getic())
            {
                double sum = ez[k].calculateCharge()-ez[k].getdeposit();
                
                System.out.println(ez[k].getName()+"Sum :"+sum);
            }
        }
    }
}
