
/**
 * Write a description of class LinkedList2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkedList2
{
   private Node2 first;
   private Node2 last;
   
   public boolean isEmpty()
   {
       return (first == null);
   }
   
   public void insertScore(double score)
   {
       Node2 newNode = new Node2(score);
       if(isEmpty())
       {
           first = newNode;
           last = newNode;
        }
        else
        {
            last.next = newNode;
            last = newNode;
        }
    }
    
    public void printScoreAccepted()
    {
       Node2 current = first;
       while(current != null)
       {
           if(Double.parseDouble(current.toString()) > 1.50)
           {
               System.out.print(current);
           }
           current = current.next;
        }
    }
}
        
       

