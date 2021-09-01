//14. Write a program to generate NoSuchMethodException
package exceptions;


public class Excp13 {
	public static void main(String[] args) {

		Data d = new Data();
		d.foo();
		//d.bar();
		//program tries to call a class method that doesn’t exist.

	}


}

 class Data {

	public void foo() {
		System.out.println("foo");
	}
	

}
