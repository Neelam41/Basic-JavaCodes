//Print instance variables in static methods
package statiC;

public class Stat2 {
int i=20;
public static void Print() {
	Stat2 s1 =new Stat2();
	s1.i=23;
	System.out.println(s1.i);
	
	
}
	public static void main(String[] args) {
	Print();
	

	}

}
