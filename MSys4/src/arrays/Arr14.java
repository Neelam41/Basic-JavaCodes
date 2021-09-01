//. Write a method to find number of even number and odd numbers in an array
package arrays;

public class Arr14 {
	public static void main(String[] args) {

		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int Even = 0,Odd=0;
		
		for(int i=0;i<array.length;i++) {
			if(i%2==0) {
				
				Even+=1;
			}
			else
	
			Odd+=1;

	}
		System.out.println(Even);
		System.out.println(Odd);

	}
	}
