//Write a function to find the missing number of sorted array of 1 to 100
package arrays;

import java.util.BitSet;

public class Arr18 {


	public static void MissingNumber(int[] Numbers, int count) 
	  { 
		  int missingNumbers = count - Numbers.length; 
		  BitSet bitset = new BitSet(count); 
		   
		  for(int number : Numbers) 
		  { 
			  bitset.set(number - 1); 
		  } 
		   
		  int missingIndex = 0; 
		  for(int i = 0; i < missingNumbers; i++) 
		  { 
			  missingIndex = bitset.nextClearBit(missingIndex); 
			  System.out.printf("%n Missing Number is %d", ++missingIndex); 
		  } 
	  } 

public static void main(String[] args) 
{ 
	int[] numbers = {1, 2, 3, 4, 5, 7, 10, 11, 13, 14, 15, 16, 17, 18, 50, 55, 60, 75, 100}; 

	MissingNumber(numbers, 100);
	}
}


