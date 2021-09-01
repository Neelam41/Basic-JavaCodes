//Use this() and super() in methods not in constructors
package thisndsuper;

class Parent1 {
	public void D(){
		System.out.println("Parent class constructor");
		
	}
}
public class ThisandSuper6 extends Parent1{
	int a=10;
	
	public  void Display() {
		System.out.println(this.a);
		super.D();
		
	}

	public static void main(String[] args) {
		
		ThisandSuper6 ts=new ThisandSuper6();
		ts.Display();
		
	}

}
