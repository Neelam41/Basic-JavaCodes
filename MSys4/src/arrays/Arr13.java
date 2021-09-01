//Write a method to find the second largest number in an array
package arrays;

public class Arr13 {
	
	public int scnd(int[] array) {
		for(int i=0;i<array.length -1;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j]>array[j+1]) {
				int temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
				
				}
				
			}
		}
		
			return array[(array.length)-2];
	
		
	}

	public static void main(String[] args) {
	Arr13 ar=new Arr13();
	int[]array= {1,4,5,6,3,8,9,2};
	
	System.out.println(ar.scnd(array));
	

	}

}
