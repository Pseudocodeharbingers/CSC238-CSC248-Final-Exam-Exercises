
/**
 * Write a description of class SingleGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SingleGame extends Games
{
   private String pn;
   private char gender;
   
   public SingleGame(String gn,String c,String gt,String p,char g)
   {
        super(gn,c,gt);
        pn = p;
        gender = g;
    }
   
    public String getPlayerName()
    {
        return pn;
    }
     
    public char getGender()
    {
        return gender;
    }
    
    public double calcFee()
    {
        double nfee = 0.0;
        if(category.equalsIgnoreCase("Indoor"))
        {
           nfee = 30.00+super.fee();
            
        }
         return nfee;
       
    }
}
