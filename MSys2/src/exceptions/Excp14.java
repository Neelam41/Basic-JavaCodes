//15. Write a program to generate NullPointerException
package exceptions;

public class Excp14{
    @SuppressWarnings("null")
	public static void main (String[] args)
    {
 
        String ptr = null;
  
      
        try
        {
            
            if (ptr.equals("neelam"))
                System.out.print("Same");
            else 
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught");
        }
    }
}