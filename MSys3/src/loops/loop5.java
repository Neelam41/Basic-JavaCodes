
// Write a program to print largest number among three numbers.
package loops;

public class loop5 {
	

	public static void main(String[] args) {

	int[] values = new int[] {27, 34, 17}; 

	System.out.println("The max value is "+Largest(values));

	}


			static int Largest(int[] a) {

			int max = a[0];

			int i=0;

			while(++i < a.length)

			if(a[i] > max) 
				max = a[i];

			return max;

			}


			
	

}
