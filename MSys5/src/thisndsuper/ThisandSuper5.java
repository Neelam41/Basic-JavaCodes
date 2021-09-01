// Call constructor of the parent class using super()
package thisndsuper;

class Parent {
	Parent(){
		System.out.println("Parent class constructor");
		
	}
}

public class ThisandSuper5 extends Parent {
	ThisandSuper5(){
		super();
	}

	public static void main(String[] args) {
		new ThisandSuper5();
	

	}

}
