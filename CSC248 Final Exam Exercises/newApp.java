
/**
 * Write a description of class newApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class newApp
{
   public static void main(String args[])
   {
       Queue abcQ = new Queue();
       Queue xyzQ = new Queue();
       LinkedList myList = new LinkedList();
       
       abcQ.enqueue("5");
       abcQ.enqueue("18");
       abcQ.enqueue("9");
       abcQ.enqueue("15");
       abcQ.enqueue("7");
       abcQ.enqueue("12");
       
       for(int j=1 ; j<6 ; j++)
       {
           Object x = abcQ.dequeue();
           int num = Integer.parseInt(x.toString());
           
           if(num <10)
           {
               myList.insertAtFront(x);
           }
           else
              myList.insertAtBack(x);
              
           if(num%5 == 0);
             xyzQ.enqueue(x);
       }
       
       Object data = myList.getFirst();
       while(data != null)
       {
           System.out.println(Integer.parseInt(data.toString()));
           data = myList.getNext();
       }
       
   }
}