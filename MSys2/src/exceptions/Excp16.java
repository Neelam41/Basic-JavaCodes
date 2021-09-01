//Write a program to generate StringIndexOutOfBoundsException
package exceptions;

public class Excp16 {

	public static void main(String[] args) {
	      String str = "Hello how are you";
	      for(int i=0; i<str.length(); i++) {
	         System.out.print(str.charAt(i));
	      }
	      System.out.println("\n");
	    
	      try {
	    	  System.out.println("charAt(40)");
	         System.out.println(str.charAt(40));
	      }catch(StringIndexOutOfBoundsException e) {
	         System.out.println("Exception occurred ");
	      }
	   }

}
