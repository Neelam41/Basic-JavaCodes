// Splitting strings with split()
package strings;

public class Str11 {

	public static void main(String[] args) {
		String s1="java string split method ";  
		String[] words=s1.split("\\s");
	 
		for(String w:words){  
		System.out.println(w);  
		}

	}

}
