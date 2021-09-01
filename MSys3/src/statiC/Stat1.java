//Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance methods and a main method.
package statiC;

public class Stat1 {

	public static int Algo=20,DS=30; //static variable
	static String r="Raju";
	
	String c="Shyam"; // instance variable
	int Algo1=45,DS1=22;
	
	public static void Print() {
		System.out.println("Marks of "+r+"\nAlgo="+Algo+" DS="+DS);
		
	}
	
	public static void Print1() {
		System.out.println("Total Marks"+(Algo)+(DS));
		
	}
	public void Change() {
		c="GhanShyam";
		System.out.println("\nMarks of"+c+"\nAlgo="+Algo+" DS="+DS);
		
	}
	public void Change1() {
		int d=34;
		DS1=d;
		System.out.println("Total Marks"+(Algo1)+(DS1) );
		
	}
	
	public static void main(String[] args) {
	      Stat1 s =new Stat1();
	      Print();
	      Print1();
	      s.Change();
	      s.Change1();
	      
	}

}
