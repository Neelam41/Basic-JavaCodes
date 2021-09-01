package inheritance;
public class C extends B{
	
	public static void C1() {
		System.out.println("1st method of Class C");
	}
	
	public static void C2() {
		System.out.println("2nd method of Class C");
	}
	
	public void Num() {
		String Pitbull="pablo";
		
		System.out.println(Pitbull);
		super.Num();
		
	}
	public static void main(String[] args) {
	
	      A.A1();  A.A2();
	
	      
		B.B1();    B.B2();	
		C c=new C();
		C1();
		C2();
		
		c.Num();
		

			
	}	
	
}
