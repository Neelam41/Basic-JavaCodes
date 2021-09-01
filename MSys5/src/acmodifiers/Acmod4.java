/*
 * 4. Create a class with PUBLIC fields and methods.
Access the public methods and fields from any 
class in the same package or different package.
 * 
 */
package acmodifiers;

import acmodifiers1.Acmod5;

public class Acmod4 extends Acmod5{
	
	public static void main(String[] args) {
		N2 n =new N2();
		System.out.println(n.age);
		n.Display();
		
		Acmod4 ac =new Acmod4();
		
		ac.display();

	}
}
class N2 {
	public int age =78;
  public void Display() {
		System.out.println("hello my name is neelam");
	}
}

