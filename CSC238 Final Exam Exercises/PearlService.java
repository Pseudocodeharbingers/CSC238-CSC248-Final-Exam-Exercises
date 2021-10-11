
/**
 * Abstract class PearlService - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class PearlService
{
    protected String custName;
    protected String IC;
    protected String phoneNum;
    
    public PearlService(String cn,String i,String pn)
    {
        custName = cn;
        IC = i;
        phoneNum = pn;
    }
    
    public String getcustName(){return custName;}
    public String getIC(){return IC;}
    public String getpn(){return phoneNum;}
    
    public abstract double calculateCharge();
    
    public String toString()
    {
        return "Name : "+custName+IC+phoneNum;
    }
}
