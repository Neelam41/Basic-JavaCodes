//Create two interfaces with one method each. Implement these two interfaces in one class.
package interfaces;

public class Int4 implements Inter4,Interface4{

	public static void main(String[] args) {
		Int4 in =new Int4();
		in.Display();
		in.Change();

	}

	public void Change() {
		System.out.println("I am Happier");
		
	}

	public void Display() {
		System.out.println("I love my National Flag");
		
	}

}

interface Inter4{
	void Display();
	
}
interface Interface4{
	void Change();
}
