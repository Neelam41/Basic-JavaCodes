//Write a function to remove a specific element from an array
package arrays;
//import java.util.Arrays;
public class arr5 {

public static void check(int[] arr,int n) {
		

    int[] anotherArray = new int[arr.length - 1];

 
    for (int i = 0, k = 0; i < arr.length; i++,k++) {

  
        if (i == n) {
            k--;
        }

        anotherArray[k] = arr[i];
		}
    for(int z=0;z<anotherArray.length;z++) {
    	
    	System.out.print(" "+anotherArray[z]);
    }
    
		  
		
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
	
		check(array,5);
		
	}

}
