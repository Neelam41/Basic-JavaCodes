//Create an interface with a default method and implement it in a class.
//Do not provide implementation to the default method and call the method.
package interfaces;


interface Default{
	  default void D(){
		  System.out.println("Default method executed");
		  
	}
}
public class Int6 implements Default{

	public static void main(String[] args) {
		Int6 in =new Int6();
		in.D();
		

	}

}


