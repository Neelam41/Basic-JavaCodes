//Create an interface with private, public and protected fields.
package interfaces;


public class Int10 {
private static interface Intr{
	//private int a =10;
	public int b=56;
	//protected int d=33;
	
}


public static class ads implements Intr {
	public static void main(String[] args) {
		System.out.println(b);
		//System.out.println(a);
		//System.out.println(d);
		
		//java.lang.ClassFormatError: Illegal field modifiers in class interfaces/Intr: 0x1B
		//System.out.println(a);
		//System.out.println(d);
	}

}
}
