//Program for multiple if else statement(Largest number in 10,20 and 30)
package loops;

public class loop13 {

	public static void main(String[] args) {
		 int n1 =10, n2 =20, n3 = 30;

	        if( n1 >= n2 && n1 >= n3)
	            System.out.println(n1 + " is the largest number.");

	        else if (n2 >= n1 && n2 >= n3)
	            System.out.println(n2 + " is the largest number.");

	        else
	            System.out.println(n3 + " is the largest number.");

	}

}
