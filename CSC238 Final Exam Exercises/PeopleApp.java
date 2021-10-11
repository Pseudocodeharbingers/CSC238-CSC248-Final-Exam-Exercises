
/**
 * Write a description of class PeopleApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PeopleApp
{
    public static void main(String args[])
    {
        People p [] = new People [2];
        Scanner s = new Scanner (System.in);
        
        for(int i = 0; i < p.length ; i++)
        {
            System.out.print("Name : ");
            String name = s.next();
            
            System.out.print("Gender : ");
            String g = s.next();
            char gender = g.charAt(0);
            
            System.out.print("Education level : ");
            String edlevel = s.next();
            
            System.out.print("Employment : ");
            String emp = s.next();
            
            System.out.print("Salary : ");
            double salary = s.nextDouble();
            
            System.out.print("Citizen or Temporary Resident(TR)");
            String choice = s.next();
            
            if(choice.equalsIgnoreCase("Tr"))
            {
               System.out.print("ID : ");
               String id = s.next();
               
                System.out.print("Country origin : ");
                String country = s.next();
                
                System.out.print("Visa duration : ");
                int vd = s.nextInt();
                
                System.out.print("Job Category : ");
                String j = s.next();
                char jc = j.charAt(0);
                
                p[i] = new TempResident (name,gender,edlevel,emp,salary,id,country,vd,jc);
            }
            
            else if(choice.equalsIgnoreCase("Citizen"))
            {
               System.out.print("Ic : ");
               String ic = s.next();
               
                System.out.print("Marital Status : ");
                String m = s.next();
                char ms = m.charAt(0);
                
                p[i] = new Citizen (name,gender,edlevel,emp,salary,ic,ms);
            }
        }
        int count = 0;
        double total = 0.0;
        for(int j = 0; j<p.length ; j++)
        {
            if( p[j] instanceof TempResident)
            {
                TempResident tr = (TempResident)p[j];
                
                if(tr.getjobCat() == 'A'|| tr.getjobCat() == 'a')
                {
                    System.out.println(tr.toString());
                    count ++;
                }
            }
            
            if( p[j] instanceof Citizen)
            {
                Citizen c = (Citizen)p[j];
                
                double tax = c.calculateTax();
                System.out.println ( "Tax : RM " +tax );
                
                total += tax;
            }
        }
        
        System.out.println(count);
        System.out.println(total);
    }       
             
}
