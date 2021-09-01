//6. Matching a String Against a Regular Expression With matches()
package strings;
import java.util.regex.*;
public class Str6 {

	public static void main(String[] args) {
	
			System.out.println(Pattern.matches(".s", "as"));
			System.out.println(Pattern.matches("[adb]", "a"));
			System.out.println(Pattern.matches(".s", "mk"));
	}

}
