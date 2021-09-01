
//4. Create an instance for the child class in child class and call non-abstract methods
 
 
package abstact;
abstract class Child2{
	 public abstract void show() ;
		 int a =34;
	 
}

class Child1 extends Child2{
	
	public void show(){
		System.out.println("my country India");
	}
}

public class Abs3 extends Child1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abs3 a= new Abs3();
a.show();

	}

}



 
