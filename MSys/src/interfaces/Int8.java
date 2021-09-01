//8. Create a PUBLIC interface with fields and methods, fields should have values assigned.
//Implement this interface to some class and print the values of the interface fields and 
//call the interface methods
package interfaces;
import interfaces1.intf;
 public class Int8 implements intf{

	public static void main(String[] args) {
		intf f=new Int8();
		f.show();
		System.out.println(intf.a);
	}

	@Override
	public void show() {
		System.out.println("interface's method executed");
		
	}

}
