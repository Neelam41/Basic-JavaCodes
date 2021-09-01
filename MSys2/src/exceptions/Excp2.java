//2. Handle the Arithmetic exception using try-catch block
package exceptions;

public class Excp2 {

	public static void main(String[] args) {
		try{
	         int num1=30, num2=0;
	         int output=num1/num2;
	         System.out.println ("Result: "+output);
	      }
	      catch(ArithmeticException e){
	         System.out.println (" divide by zero exception");
	      }
	   }
	}


