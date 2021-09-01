//3. Create a HashSet with at 
//least 10 elements of type String Write program covering all the operations of HashSet
package collections;

import java.util.HashSet;
import java.util.Iterator;
public class Collections3 {

	public static void main(String[] args)
    {
      HashSet<String> h =new HashSet<String>();
  
        // Adding elements into HashSet 
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India"); // adding duplicate elements
        h.add("China");
        h.add("NewZealand");
        h.add("Canada");
        h.add("Germany");
        h.add("France");
        
  
        // Displaying the HashSet
        System.out.println(h);
        System.out.println("List contains India or not:"
                           + h.contains("India"));
  
        // Removing items from HashSet using remove()
        h.remove("Australia");
  
        // Iterating over hash set items
        System.out.println("Iterating over list:");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
        
        //Removing elements on the basis of specified condition  
        h.removeIf(str->str.contains("Vijay"));    
        System.out.println("After invoking removeIf() method: "+h);  
        //Removing all the elements available in the set  
        h.clear();  
        System.out.println("After invoking clear() method: "+h);  
}  
        
    }



