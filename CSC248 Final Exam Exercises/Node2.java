
/**
 * Write a description of class Node2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Node2
{
   public double score;
   public Node2 next;
   
   public Node2(double sco)
   {
       this(sco,null);
   }
   
    public Node2(double sco,Node2 nextNode)
   {
       score = sco;
       next = nextNode;
   }
}
