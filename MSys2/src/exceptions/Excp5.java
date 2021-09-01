//5. Write a program to throw exception with your own message
package exceptions;


public class Excp5 {


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
