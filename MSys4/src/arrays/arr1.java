//Write a function to add integer values of an array
package arrays;

public class arr1 {
	
	public double add(double[] array) {
		int sum = 0;
		for(int i=0;i<10;i++) {
			sum+=array[i];
			
		}
		return sum/array.length;
		
	}
	
	public static void main(String[] args) {
		double[] array = {1,2.6,3,4,5,6.8 ,7.8 ,8.2,9,10};
		
		arr1 ar=new arr1();
	System.out.print(ar.add(array));
	}

}
