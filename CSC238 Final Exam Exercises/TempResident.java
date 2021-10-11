
/**
 * Write a description of class TempResident here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TempResident extends People
{
    private String piD;
    private String country;
    private int vd;
    private char jobCat;
    
    public TempResident(String n,char g,String e,String em,double s,String p,String c,int v,char j)
    {
        super.setPeople(n,g,e,em,s);
        piD = p;
        country = c;
        vd = v;
        jobCat = j;
        
    }
    public char getjobCat(){return jobCat;}
    public double calculateTax()
    {
        double tax = 0.03 * salary;
        double ntax = 0.0;
        
        if(jobCat == 'A' || jobCat == 'a')
        {
            ntax = tax + 500.00;
        }
        
        else if(jobCat == 'B' || jobCat == 'b')
        {
            ntax = tax + 100.00;
        }
        
        return ntax;
    }
    
    public String toString()
    {
        return "ID "+piD+country+vd+jobCat;
    }
        

}
