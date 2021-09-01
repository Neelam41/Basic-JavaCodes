//5. Create two interfaces with the same method (same signature) in both the interfaces.
//Implement these two interfaces in one class. Call the method.
package interfaces;

public class Int5 implements Inter5,Interface5 {


	public static void main(String[] args) {
		Inter5 in =new Int5();
		in.Display();
	
	}

	public void Display() {
		System.out.println("I love my National Flag");
		
	}
	
	

}

interface Inter5{
	void Display();
	
}
interface Interface5{
	void Display();
}


