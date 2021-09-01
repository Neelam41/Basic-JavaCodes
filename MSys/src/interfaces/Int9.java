// Create an interface with static final variable
package interfaces;

	interface NewInterface {
		static final int a=22;
		  
	    static void hello()
	    {
	        System.out.println("Hello, New Static Method ");
	    }
	}

public class Int9 implements NewInterface {

	public static void main(String[] args) {
		
		NewInterface.hello();
		System.out.println(NewInterface.a);
		
	}

}
