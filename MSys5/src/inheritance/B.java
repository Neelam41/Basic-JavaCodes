package inheritance;

public class B extends A {
	public static void B1() {
		System.out.println("1st method of Class B");
	}
	
	public static void B2() {
		System.out.println("2nd method of Class B");
	}
	
	public void Num() {
		String dog="Pitbull";
		
		System.out.println(dog);
		super.Num();
	}

}
