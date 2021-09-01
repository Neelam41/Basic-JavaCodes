//3. Print static variables in Instance methods
package statiC;

public class Stat3 {
	static int i=20;
	public void Print() {
		System.out.println(i+21);	
		
	}
		public static void main(String[] args) {
		
				Stat3 s1 =new Stat3();
				Stat3.i=23;
				System.out.println(i);
		s1.Print();
		

		}

}
