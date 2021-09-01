//Write a function for arithmetic operators(+,-,*,/)
package operators;

public class optr1 {
 int a=60,b=10;
 
	 private int add() {
		
			
		return a+b;
			
		}
	 
	 
	 private int sub() {
		
		 
		return a-b ;
	 }
	 
	 private int mul() {
		
		 
		return a*b ;
		
	 }
	 private float div() {
	
		return a/b ;
	 }
	 
	 
	public static void main(String[] args) {
	
		optr1 op=new optr1();
	System.out.println(	"a + b = "+ op.add());
	System.out.println(	"a - b = "+ op.sub());
	System.out.println(	"a * b = "+op.mul());
	System.out.println(	"a / b = "+op.div());

	}

}
