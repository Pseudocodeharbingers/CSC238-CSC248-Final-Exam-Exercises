
/**
 * Write a description of class WashingMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WashingMachine extends product
{
    private int capacity;
    
    public WashingMachine()
    {
        super();
        
        capacity = 0;
    }
    
    public WashingMachine(String p,int q,int c)
    {
        super.setproduct(p,q);
        
        capacity = c;
    }
    
    public int getCapacity()
    {
        return capacity;
    }       
}
