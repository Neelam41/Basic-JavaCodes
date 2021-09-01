// Program to check whether a number is EVEN or ODD using switch

package loops;
import java.util.Scanner;

public class loop11 {

	public static void main(String[] args) {
		
		System.out.println("Enter a no:");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		switch(a%2){
		case 0:System.out.println("Even number");
		break;
		
		case 1:System.out.println("odd number");
		break;
			
		}
		sc.close();

	}

	

}
