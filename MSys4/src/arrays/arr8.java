//. Write a function to find the minimum and maximum value of an array
package arrays;

public class arr8 {

	  public static int getMax(int[] Array){ 
		    int maxValue = Array[0]; 
		    for(int i=1;i < Array.length;i++){ 
		      if(Array[i] > maxValue){ 
		         maxValue = Array[i]; 
		      } 
		    } 
		    return maxValue; 
		  }
	  
	  
	  public static int getMin(int[] Array){ 
		    int minValue = Array[0]; 
		    for(int i=1;i<Array.length;i++){ 
		      if(Array[i] < minValue){ 
		        minValue = Array[i]; 
		      } 
		    } 
		    return minValue; 
		  } 
	  
	  
	  
	  public static void main(String args[]){
	    int array[] = new int[]{10, 11, 88, 2, 12, 120};
	 
	    int max = getMax(array);
	    System.out.println("Maximum Value: "+max);
	
	    int min = getMin(array);
	    System.out.println("Minimum Value: "+min);
	  }
	  
	  

	 
	}



