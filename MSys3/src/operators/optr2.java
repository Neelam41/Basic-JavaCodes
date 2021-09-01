//Write a method for increment and decrement operators(++, --)
package operators;

public class optr2 {
	int a=34;
	public void incr() {
	
		int b = a++ + 23;
		System.out.println(++b);
	}
	
	public void decr() {
	
        int z=a--;
		
		System.out.println(z);
	}
	

	public static void main(String[] args) {
		optr2 op =new optr2();
		
		System.out.println(op.a);
		op.incr();
		op.decr();
		
	}

}
