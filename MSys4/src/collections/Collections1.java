/*
1. Create an ArrayList of type String with 10 string elements. Add 10 string elements to ArrayList 
and perform the below operations
Add an element to the ArrayList
Iterate through the ArrayList by using Iterator object
Add an element at a specific index
Remove an element from the ArrayList, Remove at an index Update the element at a specific index
Check the element is present at a particular index
Get an element at a particular index
Find out the size of the ArrayList
Check the given element is present in the ArrayList
Remove all elements of the ArrayList
*/
package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Collections1 {

	public static void main(String[] args) {
	ArrayList<String> ar =new ArrayList<String>();
	//Add an element to the ArrayList
	ar.add("mohan");
	ar.add("rohan");
	ar.add("sohan");
	ar.add("ram");
	ar.add("shyam");
	ar.add("tina");
	ar.add("ramesh");
	ar.add("reeti");
	ar.add("preeti");
	ar.add("jagan");
	ar.add("sweety");
	//Iterate through the ArrayList by using Iterator object
	Iterator<String> iterator = ar.iterator();  
	while (iterator.hasNext())  
	{  
	String i = iterator.next();  
	System.out.println(i);  
	  
	}  
	ar.add(3,"kirti");
	//Remove an element from the ArrayList, 
	//Remove at an index Update the element at a specific index
	ar.remove(5);
	ar.remove("preeti");
	ar.set(6,"Mina");
	//Check the element is present at a particular index
	//Get an element at a particular index
	System.out.println("Is the element at index 2 is sohan ?");
	if (ar.get(2)=="sohan")
	System.out.println("yes");
	else
		 System.out.println("no");
	//Find out the size of the ArrayList
	 System.out.println(ar.size());
	//Check the given element is present in the ArrayList
	System.out.println(ar.contains("preeti"));
	//Remove all elements of the ArrayList
	ar.removeAll(ar);
	System.out.println(ar);
	
	}

}
