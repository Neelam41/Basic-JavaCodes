
//7. Write a function to insert an element at a specific position in the array
package arrays;

public class arr7 {
	 public static void insert(int[] arr, int n) {
		 
		 int[] a =new int[arr.length+1];
		 int k=0;
		 for(int i=0;i<2*(arr.length);i++) {
			
	
			 while(i<arr.length)
			 {
				 if(k==n) {
					 a[k]=25;
					 k++;
					 
				 }
				 else 
				 { a[k]=arr[i];
				 i++;
				 k++;
				 }
			 }
		
			 System.out.print(" "+a[i-arr.length]);
			
		 }
	
		
	}

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
             insert(array,2);
	}

}
