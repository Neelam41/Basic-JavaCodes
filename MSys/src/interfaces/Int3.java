//Use Interface instances to call the implemented method in the implemented class

package interfaces;

public class Int3 implements Inter3{

	public static void main(String[] args) {
		Inter3 in =new Int3();
		in.Display();	

	}

	public void Display() {
		System.out.println("I am unstopable");
	}

}

interface Inter3{
	void Display();
	
}