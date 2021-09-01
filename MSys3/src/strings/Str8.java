//8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
package strings;

public class Str8 {

	public static void main(String[] args) {
		String s="heelo my name is neelam";
		String s1="priya";
		
		String s2=new String("priya");
		String s3=new String("Priya");
		System.out.println(s1.equalsIgnoreCase(s3));//true
		System.out.println(s1.compareTo(s2));//0  (equal)
		System.out.println(s1.startsWith("p"));//true
		
		System.out.println(s.endsWith("t"));//false
		
		

	}

}
