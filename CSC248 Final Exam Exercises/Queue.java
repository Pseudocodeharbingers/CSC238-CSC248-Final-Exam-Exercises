import java.util.NoSuchElementException;
public class Queue extends LinkedList
{
    public Queue()
    {   }
    
    public void enqueue(Object i)
    {
        insertAtBack(i); }
        
    public Object dequeue()
    {
        return removeFromFront() ; }
        
         public Object getFront()
    {
        return getFirst();
    }
    
    public Object getEnd()
    {
        Object obj = removeFromBack();
        insertAtBack(obj);
         return obj;
       
    }
}
