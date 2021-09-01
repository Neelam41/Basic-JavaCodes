// Create an interface with two methods, 
//but implement only one in a class. Call the method implemented.

package interfaces;

public class Int2 extends B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Int2 in =new Int2();
     in.Display();
     in.Change();

	}

	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("I love my National Flag");
	}


}

 abstract class B implements Inter2{
		public void Change() {
		// TODO Auto-generated method stub
	System.out.println("i love my culture");
	
	}

}

interface Inter2{
	void Display();
	void Change();
	
	
}