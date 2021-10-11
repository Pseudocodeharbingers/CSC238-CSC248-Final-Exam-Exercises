
/**
 * Write a description of class UitmStaffApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
public class UitmStaffApp
{
    public static void main(String args[])
    {
        LinkedList dlink = new LinkedList();
        UitmStaff us;
        
        for(int i= 0 ; i<2 ; i++)
        {
              String a = JOptionPane.showInputDialog("Staff ID ");
              int si = Integer.parseInt(a);
              String b = JOptionPane.showInputDialog("Salary ");
              double sl = Double.parseDouble(b);
              String c = JOptionPane.showInputDialog("Post ");
              int p = Integer.parseInt(a);
              
              us = new UitmStaff(si,sl,p);
              dlink.insertAtFront(us);
        }
        
        Object staff = dlink.getFirst();
        double total = 0.0;
        int count = 0;
        while(staff != null)
        {
            us = (UitmStaff) staff;
            total += us.getSalary();
            count ++;
            
            staff = dlink.getNext();
        }
        
        System.out.print("Average is RM "+ total/count);
    }
}
