//4. Write a program with multiple catch blocks
package exceptions;

public class Excp4 {

	 public static void main(String[] args) {  
         
         try{    
              int a[]=new int[5];    
              a[5]=30/0;    
             }    
             catch(ArithmeticException e)  
                {  
                 System.out.println("Arithmetic Exception ");  
                }    
             catch(ArrayIndexOutOfBoundsException e)  
                {  
                 System.out.println("ArrayIndexOutOfBounds Exception ");  
                }    
             catch(Exception e)  
                { 
                 System.out.println("Parent Exception ");  
                }             
        
  }  
}
