
/**
 * Write a description of class LinkedList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkedList
{
    private Node first;
    private Node current;
    private Node last;
    
    public boolean isEmpty()
    {
        return (first == null); 
    }
    
    public void insertAtFront(Object i)
    {
        Node newNode = new Node(i);
        if(isEmpty())
        {
            first = newNode;
            last = newNode;
        }
        
        else
        {
            newNode.next = first;
            first = newNode;
        }
    }
    
    public void insertAtBack(Object i)
    {
        Node newNode = new Node(i);
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
    
    
    public Object removeFromFront()
    {
        Object removeItem = null;
        if(isEmpty())
        {
            return removeItem; 
        }
        
        removeItem = first.data;
        if(first == last)
        {
            first = null;
            last = null;
        }
        else
        {
            first = first.next;
        }
        
        return removeItem;
    }
    
    public Object removeFromBack()
    {
        Object removeItem = null;
        if(isEmpty())
        { 
            return removeItem; 
        }
        
        removeItem = last.data;
        if(first == last)
        {
            first = null;
            last = null;
        }
        else
        {
            current = first;
            while(current.next != last)
            {
                current = current.next;
                last = current;
                last.next = null;
            }
        }
        return removeItem;
    }
    
    
    
    public Object getFirst()
    {
        if(isEmpty())
        {
            return null;
        }
        
        else
        {
            current = first;
            return current.data;
        }
    }
    
    public Object getNext()
    {
        if(current == last )
        {
            return null;
        }
        
        else
        {
            current = current.next;
            return current.data;
        }
        
    }
            
        
}
