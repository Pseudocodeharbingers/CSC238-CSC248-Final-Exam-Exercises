
/**
 * Write a description of class MobilePhoneApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class MobilePhoneApp
{
  public static void main(String args[])
  {
   
      MobilePhone [] mp = new MobilePhone [2];
      Scanner s = new Scanner(System.in);
      int count = 0;
      
      for(int i = 0; i<mp.length; i++)
      {
          System.out.print("Enter brand :");
          String b = s.next();
          System.out.print("Enter price :");
          double p = s.nextDouble();
          System.out.print("Enter model name :");
          String mn = s.next();
          System.out.print("Enter screen size :");
          double ss = s.nextDouble();
          System.out.print("Enter discount percent :");
          double dp = s.nextDouble();
          
          mp[i] = new MobilePhone(b,p,mn,ss,dp);
        }
        
        for(int j=0 ; j<mp.length ; j++)
        {
            if(mp[j].getscreenSize()>5.5)
            {
                count++;
            }
        }
        
        System.out.println(count);
    }

}
