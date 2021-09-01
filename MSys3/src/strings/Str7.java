//7. Comparing strings using the methods equals()
package strings;

public class Str7 {

	 public static void main(String args[]){  
		   String s1="jay";  
		   String s2="Vikram";  
		   String s3=new String("JAY");  
		   String s4="jay";  
		   System.out.println(s1.equals(s2));//flase  
		   System.out.println(s1.equals(s3));//false  
		   System.out.println(s1.equals(s4));//true  
		 } 
}
