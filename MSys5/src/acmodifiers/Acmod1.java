/*Create a class with PRIVATE fields, private method and a main method. 
*Print the fields in main method. Call the private method in main method.
*/
package acmodifiers;

public class Acmod1  {
	
	private int a =54;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	private void display() {
		System.out.println("My name is Neelam");	
	}
	
	public static void main(String[] args) {
	Acmod1 ac=new Acmod1();
	System.out.println(ac.getA());
	ac.display();
	Acmod ac1 =new Acmod();
	ac1.change();
	
	
	}
	

}
class Acmod extends Acmod1 {
	private int b=45;
	void change() {
		System.out.println(b);
		
	}
	
	
}

