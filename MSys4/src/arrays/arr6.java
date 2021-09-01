//Write a function to copy an array to another array
package arrays;

public class arr6 {
	public static void copy(int[] arr) {
	
	  int[] anotherArray = new int[arr.length];

	  
	    for (int i = 0; i < arr.length; i++) {

	        anotherArray[i] = arr[i];
	    	
	    	System.out.print(" "+anotherArray[i]);
	    }
	}
	    
		
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
	
		copy(array);

	}

}
