//Write a function to calculate the average value of an array of integers
package arrays;

public class arr2 {
	public double addno(int[] array) {
		int sum = 0;
		for(int i=0;i<10;i++) {
			sum+=array[i];
			
		}
		
		return sum/array.length;
		
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		arr2 ar=new arr2();
	System.out.print(ar.addno(array));
	}



}
