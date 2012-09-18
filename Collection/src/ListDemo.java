import java.util.LinkedList;
import java.util.ListIterator;

/**
   This program demonstrates the LinkedList class.
*/
public class ListDemo1
{  
   public static void main(String[] args)
   {  
      LinkedList<String> staff = new LinkedList<String>();
      staff.addLast("Diana");
      staff.addLast("Harry");
      System.out.println(staff);
      staff.addLast("Romeo");
      staff.addLast("Tom");
      
      // | in the comments indicates the iterator position

      ListIterator<String> iterator = staff.listIterator(); // |DHRT
      iterator.next(); // D|HRT
      iterator.next(); // DH|RT
      System.out.println(staff);

      // Add more elements after second element
      
      iterator.add("Juliet"); // DHJ|RT
      iterator.add("Nina"); // DHJN|RT

      iterator.next(); // DHJNR|T

      // Remove last traversed element 

      iterator.remove(); // DHJN|T
     
      // Print all elements

      System.out.println(staff);
      System.out.println("Expected: [Diana, Harry, Juliet, Nina, Tom]");
      
      System.out.println("test to see the changes made to the list demo file");
   }
}

