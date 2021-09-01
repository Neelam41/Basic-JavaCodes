//3. Apply private, public, protected and default access modifiers to the constructor
package constructor;

public class Cnst3 {
	private Cnst3() {
		
			System.out.println("default constructor");
			
		}
		public Cnst3(int a){
			System.out.println(a);
			
		}
		protected Cnst3(int b,String c){
			System.out.println(c+""+b);
			}
	

	public static void main(String[] args) {
		
new Cnst3();
new Cnst3(10);
new Cnst3(100,"neelam");
	}

}
