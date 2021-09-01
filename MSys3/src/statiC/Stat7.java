//7. Call static methods and instance methods in main method
package statiC;

public class Stat7 {
	static String s="Neeraj Chopra";
	public static void Print1() {
		
		System.out.println(Stat7.s ); 	
	
	}
	public void Print() {
		System.out.println("Indian Gold Medallist");
	}

	public static void main(String[] args) {
	Stat7 St=new Stat7();
	St.Print();
	Print1();
	

	}

}
