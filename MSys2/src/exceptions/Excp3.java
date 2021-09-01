//3. Write a method which throws exception, Call that method in main class without try block
package exceptions;

public class Excp3 {
	void Display() {
	
	        int num1=30, num2=0;
	        int output=num1/num2;
	        System.out.println ("Result: "+output);
	   
	}
	

	public static void main(String[] args) {
	Excp3 ex =new Excp3();
	
	ex.Display();

	}

}
