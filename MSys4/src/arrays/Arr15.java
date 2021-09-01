//Write a function to get the difference of largest and smallest value
package arrays;

public class Arr15 {

	public int difference(int[] array) {
		for(int i=0;i<array.length -1;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j]>array[j+1]) {
				int temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
				
				}
				
			}
		}
		
			return array[(array.length)-1]-array[0];
	
		
	}

	public static void main(String[] args) {
	Arr15 ar=new Arr15();
	int[]array= {1,4,5,6,3,8,9,2};
	
	System.out.println(ar.difference(array));
	

	}

}
