
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student
{
   private String name;
   private int id;
   private double cgpa;
   
   public Student()
   {
       name = " ";
       id = 0;
       cgpa = 0.0; }
       
   public Student(String n, int i, double c)
   {
       name = n ;
       id = i;
       cgpa = c; }
       
   public String getName(){ return name ; }
   public int getId(){ return id ; }
   public double getCgpa(){ return cgpa ; }
}
