//1. Create an abstract class with abstract and non-abstract methods.
package abstact;

 abstract class Abs {

	public abstract void Name();
	public void Age() {
		int age =78;
		
		System.out.println(age);
		
	}

	
}

 public class Abs1 extends Abs{

		public static void main(String[] args) {
			Abs d =new Abs1();
			d.Name();
			d.Age();
			

		}

		@Override
		public void Name() {
			System.out.println("Name: Neelam");
			
			
		}
 }


