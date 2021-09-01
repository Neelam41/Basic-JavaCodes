/*
 * A, B and C are classes
A is a super class. B is a sub class of A. C is a sub class of B.
Create three methods in each class, 2 methods are specific to each class and third method (override method) should be in all three Classes A, B and C
Create a class with main method. Create an object for each class A, B and C in main method and call every method of each class using its own object/instance.
Call an overridden method with super class reference to B and C class’s objects
Runtime Polymorphism with Data Members/Instance variables, Repeat the above process only for data members
package inheritance;

 */

package inheritance;

public class A {

	public static void A1() {
		System.out.println("1st method of Class A");
	}
	
	public static void A2() {
		System.out.println("2nd method of Class A");
	}
	
	public void Num() {
		 String animal="dog";
		System.out.println(animal);	
	}


	

}
