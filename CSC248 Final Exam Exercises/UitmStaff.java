
/**
 * Write a description of class UitmStaff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UitmStaff
{
   private int staff_id;
   private double salary;
   private int post;
   
   public UitmStaff(int s,double sal,int p)
   {
       staff_id = s;
       salary = sal;
       post = p;
   }
   
   public int getID(){return staff_id; }
   public double getSalary(){return salary; }
   public int getPost(){return post; }
}
