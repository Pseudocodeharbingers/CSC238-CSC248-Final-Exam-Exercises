
/**
 * Write a description of class EZTravelApplicant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class EZTravelApplicant
{
    private String name;
    private String ic;
    private char flight;
    private double deposit;
    
    public EZTravelApplicant(String n,String i,char f,double d)
    { name = n;
      ic = i;
      flight = f;
      deposit = d;
    }
    
    public String getName()
    {
        return name;
    }
    public String getic()
    {
        return ic;
    }
    public double getdeposit()
    {
        return deposit;
    }
    
    public abstract double calculateCharge();
    
}
