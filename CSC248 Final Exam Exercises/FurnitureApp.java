
/**
 * Write a description of class FurnitureApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class FurnitureApp
{
   public static void main(String args[])
   {
       LinkedList FurnitureLL = new LinkedList();
       LinkedList modernLL = new LinkedList();
       LinkedList classicLL = new LinkedList();
       LinkedList exclusiveLL = new LinkedList();
       Scanner sc = new Scanner(System.in);
       Furniture f; 
       
       System.out.print("How many datas ");
       int num = sc.nextInt();
       
       for(int i=0 ; i<num ; i++)
       {
            System.out.print("Furniture Code : ");
            String a = sc.next();
            System.out.print("Manifacturer : ");
            String b = sc.next();
            System.out.print("Price : RM ");
            double c = sc.nextDouble();
            System.out.print("Payment Mode : ");
            String d  = sc.next();
            System.out.print("Design : ");
            String e = sc.next();
            f = new Furniture(a,b,c,d,e);
            FurnitureLL.insertAtFront(f);
       }
       
       Object data = FurnitureLL.getFirst();
       while(data != null)
       {
           f = (Furniture) data;
           if(f.getDesign().equalsIgnoreCase("Modern"))
           {
               modernLL.insertAtFront(f);
           }
           else
              classicLL.insertAtFront(f);
              
           data = FurnitureLL.getNext();
       }
       
       double totalCash = 0.0;
       double totalCredit = 0.0;
       int countCash = 0;
       int countCredit = 0;
       Object data1 = modernLL.getFirst();
       while(data != null)
       {   f = (Furniture) data1;
           if(f.getMode().equalsIgnoreCase("cash"))
           {
               totalCash += f.getPrice();
               countCash++;
            }
            
            else
               totalCredit += f.getPrice();
               countCredit++;
               
               data = modernLL.getNext();
       }
       
       System.out.println("Total Payment By Cash : RM " + totalCash );
       System.out.println("Total Payment By Credit: RM " + totalCredit);
       System.out.println("Number of payment by cash " + countCash);
       System.out.println("Number of payment by credit " + countCredit);
       
       if(countCredit > countCash)     
           System.out.println("The customer prefer to pay by credit ");
        else
           System.out.println("The customer prefer to pay by cash ");
    
   }
}
