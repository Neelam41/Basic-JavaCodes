// Write a program to generate NumberFormatException
package exceptions;

public class Excp15 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {  
        int a = Integer.parseInt(null); //throws Exception as     
        //the input string is of illegal format for parsing as it is null.  
        long b=Long.parseLong("b2");
	}  
 

}
