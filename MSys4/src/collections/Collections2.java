//2. Create a HashMap with at least 10 key value pairs of the Student
//ID and Name Insert a Key value mapping into the map
//Fetch the value of a Key
//Create a clone/copy of HashMap
//Check if the given Key is in the Map
//Check if the value is in the Map
//Check if the map is empty
//Print the size of the Map to the console
//Print all the Keys of the map to the console Print all
//the Keys of the map to the console Remove a specific Key-value pair
//Copy all the elements of the Map to another Map
package collections;

import java.util.HashMap;

public class Collections2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> student =new HashMap<Integer,String>();
student.put(1, "rohan");
student.put(2, "mohan");
student.put(3, "sohan");
student.put(4, "geeta");
student.put(5, "seeta");
student.put(6, "reeta");
student.put(7, "neeta");
student.put(8, "teena");
student.put(9, "meena");
student.put(10, "reena");
//Fetch the value of a Key
System.out.println(student.values());
//Create a clone/copy of HashMap
System.out.println(student.clone());
//Check if the given Key is in the Map
System.out.println(student.containsKey(3));
//Check if the value is in the Map
System.out.println(student.containsValue("reeta"));

//Check if the map is empty
System.out.println(student.isEmpty());
//Print the size of the Map to the console
System.out.println(student.size());

//Print all the Keys of the map to the console 
System.out.println(student.keySet());

// Remove a specific Key-value pair
System.out.println(student.remove(5));

//Copy all the elements of the Map to another Map
HashMap<Integer, String> student1 = new HashMap<Integer, String>();
student1.putAll(student);
System.out.println(student1);



	}

}
