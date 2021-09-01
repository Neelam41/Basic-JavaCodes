//. Write a program to create your own exception
package exceptions;

class MyException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String str1;
	  
	   MyException(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return (str1) ;
	   }
	}

public class Excp6 {

	 public static void main(String args[]){
			try{
				System.out.println("Starting of try block");
			
				throw new MyException("This is error Message");
			}
			catch(MyException exp){
				System.out.println("Catch Block") ;
				System.out.println(exp) ;
			}
		   }

}
