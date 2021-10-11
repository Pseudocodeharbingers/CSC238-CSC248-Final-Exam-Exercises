
/**
 * Write a description of class People here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class People
{
   protected String name;
   protected char gender;
   protected String edlevel;
   protected String employment;
   protected double salary;
   
   public People()
   {
     name = " ";
     gender = ' ';
     edlevel = " ";
     employment = " ";
     salary = 0.0;
   }
   
   public void setPeople(String n,char g,String e,String em,double s)
   {
     name = n ;
     gender = g;
     edlevel = e ;
     employment = em ;
     salary = s;
   }
   
   public String toString()
   {
       return "name"+name+gender+edlevel+employment+salary;
   }
   abstract public double calculateTax();

}
