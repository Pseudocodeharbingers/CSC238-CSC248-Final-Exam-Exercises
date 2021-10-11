
/**
 * Write a description of class Citizen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Citizen extends People
{
    private String IC;
    private char ms;
    
    public Citizen(String n,char g,String e,String em,double s,String i,char m)
    {
        super.setPeople(n,g,e,em,s);
        IC = i;
        ms = m;
    }
    
    public double calculateTax()
    {
        double tax = 0.25 * salary;
        double ntax = 0.0;
        if(ms == 'M' || ms == 'm')
        {
            ntax = tax - 200.00;
        }
        
        else
            ntax = tax;
            
         return ntax;
    }
    
    public String toString()
    {
       return "IC" + IC + ms + super.toString();
    }
}
