
/**
 * Write a description of class AppOct16 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class AppOct16
{
   public static void main(String args[]){
   ArrayList <Integer> list = new ArrayList();
   int data = 2;
   
   for(int i=0 ; i<3 ; i++)
   {
       data = data * 3;
       if(data %2 == 0)
       {
           list.add(data);
           data++;
       }
       
       else
          list.add(i,data);
          
          System.out.print(data + " ");
   }
   
   for(int i=2 ; i<3 ; i++)
   {
       System.out.print(data);
    }
   
}
}
