// Call constructor of the current class using this()
package thisndsuper;

public class ThisandSuper3 {
	
		ThisandSuper3(){
			System.out.println("hello a");
			}  
		ThisandSuper3(int x){  
		this();  
		System.out.println(x);  
		}  
		}  
		class TestThis5{  
		public static void main(String args[]){ 
			
		new ThisandSuper3(10);  
		}} 