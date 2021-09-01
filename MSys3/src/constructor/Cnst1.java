// Write a class with a default constructor, 
//one argument constructor and two argument constructors. 
//Instantiate the class to call all the constructors of that class from a main class

package constructor;
 class P{
	P(){
		System.out.println("default constructor");
		
	}
	P(int a){
		System.out.println(a);
		
	}
	P(int b,String c){
		System.out.println(c+""+b);
		}
	
}

public class Cnst1 {

	public static void main(String[] args) {
	new P();
	new P(10);
	new P(100,"Java");

	}

}
