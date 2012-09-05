import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;
import java.util.TreeSet;

// import all classes from the java.util package


/**
 * Maps Exercise
 * 
 * @author: A00168428 Irene Nooney
 * @Version: 05/09/2012
 */
public class FriendMap
{
   public static void main(String[] args)
   {    
      // Scanner object to allow keyboard input
      Scanner keyboard = new Scanner(System.in);
        
      // create the HashMap (what type is each key, what type is each value?)
      // possible to use an array list if two friends called mary.
      
      Map<String, Set<String>> friendMap = new HashMap<String, Set <String>>(); 
      // creating a set to add names to
      
      Set<String> SueFriends = new TreeSet<String>();

      // create a set for Sue's group of friends
      
      
      
      
      // add each of Sue's friends to the set
      
      // option suesFriends.add("Bobby");  put sue and her friends group (set)
      // into the hashmap friendsMap.put ("Sue", suesFriends);
     
      // option to use tree for order, use hash no order
      
      SueFriends.add("Rory");
      SueFriends.add("Andru");
      SueFriends.add("Irene");
      SueFriends.add("Edel");
      
      

      // put Sue and her Friends Group (Set) into the HashMap
      friendMap.put("Sue", SueFriends);

      // repeat for Cathy:
      Set<String> CathysFriends = new TreeSet<String>();
    
      
      // create a set for cathy's friends
      
      
      // add each friend to the set
      
      CathysFriends.add("Paula");
      CathysFriends.add("Jennifer");
      CathysFriends.add("Anne");
      CathysFriends.add("Michael");
      
      // put Cathy and her friends into the HashMap
      friendMap.put("Cathy", CathysFriends);
      
     
      // repeat for Bob
      Set<String> BobsFriends = new TreeSet<String>();
      BobsFriends.add("Fred");
      friendMap.put("Bob", BobsFriends);
     
   System.out.println("input name");
      
      // Input a name using the Scanner
   
      String name = keyboard.nextLine();
      
      
      
      // get the corresponding group of friends
      // notes: if(friendMap.containsKey(name)) {//get and display the group of friends}
      
      if(friendMap.containsKey(name)) 
      	{ 
    	  //get and display the group of friends
    	  System.out.println(friendMap.get(name));
    	 
      	}
      
      // If the group exists (not null)

          // display the group of friends


      // otherwise display a suitable message

    }
}