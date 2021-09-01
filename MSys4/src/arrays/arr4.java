//Write a function to test if array contains a specific value
package arrays;

public class arr4 {
public boolean index(int[] arr,int n) {
		
		for(int i=0;i<10;i++) { 
			if(n==arr[i])
			    return true;
			else
				continue;
			
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		arr4 ar=new arr4();
		System.out.println("array conatins element:"+ar.index(array,5));
		
	}
}
