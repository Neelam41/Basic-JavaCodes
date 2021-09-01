// Create a PRIVATE or PROTECTED interface and print the values as above scenario

package interfaces;


 public class Int11{
	private static interface animal{
		public void eat();
		public void walk();
		
	}
	
	protected static interface birds{
		public void fly();
	}


static class Cat implements animal , birds{
	
	public void eat() {
		System.out.println("eating");
		
	}

	public void walk() {
	
		System.out.println("walking");
		
	}
		
	@Override
	public void fly() {
		System.out.println("flying");
		
	}

		public static void main(String[] args) {
	
Cat c =new Cat();
c.eat();
c.walk();
c.fly();

	}

		
}
 }
