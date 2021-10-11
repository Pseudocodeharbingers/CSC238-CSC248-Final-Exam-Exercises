
/**
 * Write a description of class App here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QApp
{
    public static void main(String args[])
    {
        Queue firstQ = new Queue();
        Queue secondQ = new Queue();
        
        firstQ.enqueue("Dots");
        firstQ.enqueue("Running");
        firstQ.enqueue("Monkeys");
        firstQ.enqueue("Prison");
        
        for(int i=0 ; i<4 ; i++)
        {
            Object q = firstQ.dequeue();
            secondQ.enqueue(q.toString().substring(i,i+3));
        }
        
        int total = 0;
        while(!secondQ.isEmpty())
        {
            Object data = secondQ.dequeue();
            secondQ.enqueue(data);
            total += data.toString().length();
            
        }
        
        while(!secondQ.isEmpty())
        {
            System.out.println(secondQ.dequeue());
        }
        System.out.println( " ");
    }        
}
