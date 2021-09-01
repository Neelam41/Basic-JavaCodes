//4. Call instance methods in static methods
package statiC;

public class Stat4 {
	String s="Captain Vikram Batra";
	public void Print() {
		System.out.println("SherShaah");
		
	}
	public static void Print1() {
		Stat4 s1 =new Stat4();
		System.out.println(s1.s ); 	
		s1.Print();
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stat4.Print1();
	}

}
