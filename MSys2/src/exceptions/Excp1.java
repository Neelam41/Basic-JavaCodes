//1. Write a program to generate Arithmetic Exception without exception handling
package exceptions;

public class Excp1 {

		void division(int a,int b)
		{
		int c=a/b;
		System.out.println("Value after division: "+c);
		}
		public static void main(String[] args)
		{
		Excp1 ex=new Excp1();
		ex.division(10,0);
		}
		}

