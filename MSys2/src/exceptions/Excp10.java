//10. Write a program to generate ClassNotFoundException
package exceptions;

public class Excp10 {

	public static void main(String args[]) {
        try 
        {
            Class.forName("Class1");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}
