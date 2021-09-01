//. Create a class with PROTECTED fields and methods. 
//Access these fields and methods from any other class in the same package.
//Access the PROTECTED fields and methods from any class in different package
package acmodifiers;

import acmodifiers1.Acmod5;

public class Acmod3 extends Acmod5{


	public static void main(String[] args) {
		Acmod3 ac =new Acmod3();
	
		ac.display();
		
		N1 n =new N1();
		n.Display();

		
	}

}
 class N1 {
	protected int age =56;
  protected void Display() {
		System.out.println("hello my name is neelam");
	}
}
