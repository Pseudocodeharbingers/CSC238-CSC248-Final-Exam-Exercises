
/**
 * Write a description of class StudentAPP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;
public class StudentAPP
{
    public static void main(String args[])
    {
        Student st = new Student();
        Scanner s = new Scanner(System.in);
        ArrayList list = new ArrayList();
        
        for(int i=0 ; i<2 ; i++)
        {
            System.out.print("Name : ");
            String name = s.next();
            
            System.out.print("Id : ");
            int id = s.nextInt();
            
            System.out.print("Cgpa : ");
            double cgpa = s.nextDouble();
            
            st = new Student(name,id,cgpa);
            list.add(st);
        }
        double total = 0.0;
    
        for(int i=0 ; i<list.size() ; i++)
        {
            st = (Student)list.get(i);
            total += st.getCgpa();
        }
        double avg = total / list.size();
        System.out.print("Average : " + avg);
        
        int countLess = 0;
        for(int i=0 ; i<list.size() ; i++)
        { st = (Student)list.get(i);
            if(st.getCgpa() < avg)
            {
                 countLess++;
            }
        }
        System.out.println("Number students with CGPA less than the average "+countLess);
        for(int i=0 ; i<list.size() ; i++)
        { st = (Student)list.get(i);
            if(st.getCgpa() < avg)
            {
                 System.out.println("List of students with CGPA less than the average "+ st.getName() + " " +st.getId());
            }
            
            else if(st.getCgpa() > avg)
            {
                 System.out.println("List of students with CGPA greater than the average "+ st.getName() + " " +st.getId());
            }
             
        }
}
}
