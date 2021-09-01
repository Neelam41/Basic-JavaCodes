// Write a program to find the index of an array element
package arrays;

public class arr3 {
	public int index(int[] arr,int n) {
		
		for(int i=0;i<10;i++) { 
			if(n==arr[i])
			    return i;
			else
				continue;
			
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		arr3 ar=new arr3();
		System.out.println("Index is:"+ar.index(array,5));
	}

}
