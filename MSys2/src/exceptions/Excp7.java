//Write a program with finally block
package exceptions;

public class Excp7 {

	 public static void main(String args[]){    
		  try{    
		
		   int data=25/0;    
		   System.out.println(data);    
		  }    
		
		  catch(ArithmeticException e){  
		System.out.println(e);  
		}    

		 finally {  
		System.out.println("finally block executed");  
		}    
		    

		  }    
}
