//Call the constructors(both default and argument constructors) of super class from a child class
package constructor;
class Parent2{
	
		Parent2(){
			System.out.println("default constructor");
			
		}
		
		Parent2(int a){
			System.out.println(a);		
		
	}
}

public  class Cnst2 extends Parent2 {

		int a=10;
		
		public Cnst2() {
			super(); 
		}
		
		public Cnst2(String b) {
			super(10);
			System.out.println(b); 
		}
		

public static void main(String[] args) {

		new Cnst2();
		new Cnst2("Parameterized Constructor");		
			
			
			
		}

	}

