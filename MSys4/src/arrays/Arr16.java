// Write a method to verify if the array contains two specified elements(12,23)
package arrays;

import java.util.ArrayList;
public class Arr16 {
	
	public boolean Check(int[] array,int n, int m) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	for(int k : array) {
		al.add(k);
		
	}
	
	if(al.contains(n)&& al.contains(m))
		return true;
	else
		return false;	
		
		
		
	}

	public static void main(String[] args) {
		int[] array = {2,34,4,67,88,12,3,23};
		Arr16 ar =new Arr16();
		System.out.println(ar.Check(array,12, 23));
		
		

	}

}
