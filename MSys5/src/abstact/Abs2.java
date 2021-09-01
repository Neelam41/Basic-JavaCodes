//2. Create a sub class for an abstract class. 
//Create an object in the child class for the abstract class 
//and access the non-abstract methods
package abstact;

abstract class Display{
	public abstract void Name();
	public void Age() {
		int age =78;
		
		System.out.println(age);
		
	}
	
}
public  class Abs2 extends Display{
	public void Name() {
		System.out.println("Nmae: Neelam");
		
	}

	public static void main(String[] args) {
		Display d =new Abs2();
	
		d.Age();
		

	}

}

