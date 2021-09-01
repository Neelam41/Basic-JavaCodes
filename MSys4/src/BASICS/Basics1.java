// How to create a class, object, method and its signature
package BASICS;

public class Basics1 {
	
	int x=23;
	public String Name(String n) {
		return n;
	}
	
	public static void main(String[] args) {
		
		Basics1 bs1= new Basics1();
		System.out.println(bs1.x);
	   System.out.println( bs1.Name("Ram"));		

	}

}
