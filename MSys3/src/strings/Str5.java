//
//5. Searching in strings using indexOf()
package strings;

public class Str5 {

	public static void main(String[] args) {
		String s1="This is new World";
		int index=s1.indexOf('s');//returns the index of s char value  
		System.out.println(index);//3  
		int index1=s1.indexOf("is");//returns the index of is substring  
	
		System.out.println(index1); //2
		int index2=s1.indexOf("is",4);//returns the index of is substring after 4th index  
		System.out.println(index2);//5
		
		
		}

	}

