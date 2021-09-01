//9. Write a program to generate ArrayIndexOutOfBoundException
package exceptions;

public class Excp9 {

	public static void main (String[] args)
	{
	String[] veggies = {"Onion", "Carrot", "Potato", "Tomato", "Cucumber", "Radish"};
	for (int i=0; i<=veggies.length; i++)
	{
	System.out.print (veggies[i] + " ");
	}
	}
}
