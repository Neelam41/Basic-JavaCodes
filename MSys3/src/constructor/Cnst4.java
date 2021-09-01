
//Try to call the constructor multiple times with the same object
package constructor;

public class Cnst4 {
Cnst4(int a){
	System.out.println(a);
}
	public static void main(String[] args) {
		int a=10;
		while(a<20) {
		new Cnst4(a);
		a++;
		
		}


}
}