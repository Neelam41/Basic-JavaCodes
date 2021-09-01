package interfaces;

 interface Int{

	public void Display();
	
}

public class Int1 implements Int{

	public void Display() {
		System.out.println("I love my county India");
		
		
	}
	public static void main(String[] args) {
		Int1 i =new Int1();
		i.Display();

	}

	
}