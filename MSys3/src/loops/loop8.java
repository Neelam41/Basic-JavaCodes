// Write a program to find Armstrong number or not
package loops;
import java.util.Scanner;
public class loop8 {

	public static void main(String[] args) {
		loop8 l=new loop8();
		
		int i=1,arm;
		System.out.println("Enter Armstrong no:");
		Scanner sc =new Scanner(System.in);
		int z=sc.nextInt();
		
		arm=l.ArmOrNot(z);
		if(arm==z)
		System.out.println("Armstrong no" +i);
		else 
			System.out.println("not a armstrong no");
		sc.close();
		
		}
	
	
		public int ArmOrNot(int num){
		int x,a=0;
		while(num!=0){
		x=num%10;
		a=a+(x*x*x);
		num/=10;
		}
		return a;
		}
		

	

}
