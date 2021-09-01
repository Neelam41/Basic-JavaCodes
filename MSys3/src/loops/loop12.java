// Print gender (Male/Female) program according to given M/F using switch
package loops;

import java.util.Scanner;

public class loop12 {

	public static void main(String[] args) {
		System.out.println("Enter your gender:");
		Scanner sc =new Scanner(System.in);
		char a=sc.next().charAt(0);
		switch(a){
		case 'M':System.out.println("Male");
		break;
		
		case 'F':System.out.println("Female");
		break;
			
		}
		sc.close();

	}

}
