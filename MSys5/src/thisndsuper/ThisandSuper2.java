//2. Print the fields/instance members of the parent class using super
package thisndsuper;

class Display{
	int a =56;
	String name="neelam";
	public void d() {
		System.out.println("my age is"+name);
	}
	
}

public class ThisandSuper2 extends Display{

	ThisandSuper2(){
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		ThisandSuper2 ts =new ThisandSuper2();
		ts.d();
	}

}
