
// Write a program to palindrome or not.
package loops;

import java.util.Scanner;

public class loop10 {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a phrase: ");
		String phrase = scan.next() + scan.nextLine();
		phrase = phrase.replace(" ", "");
		
		String reverse = "";
		
		for(int i = phrase.length() - 1; i >= 0; i--) {
			reverse += phrase.charAt(i);
		}
		
		System.out.println(reverse);
		
		boolean palindrome = true;
		for(int i = 0; i < phrase.length(); i++) {
			if(reverse.charAt(i) != phrase.charAt(i)) {
				palindrome = false;
			}
		}
		
		if(palindrome) {
			System.out.println("Palindrome!");
		} else {
			System.out.println("Not a palindrome");
		}
		scan.close();
		
	}

}

