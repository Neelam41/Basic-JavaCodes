//Create an instance for the child class 
//in child class and call abstract methods

package abstact;

	abstract class Child{
		 public abstract void show() ;
			 int a =34;
		 
	}

	public class Abs4 extends Child{
		public void show(){
			System.out.println("my country India");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Abs3 a= new Abs3();
	a.show();

		}

	}


