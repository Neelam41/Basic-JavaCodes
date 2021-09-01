//. Create a class with DEFAULT fields and methods. 
//Access these fields and methods from any other class in the same package
package acmodifiers;

public class Acmod2 {

	public static void main(String[] args) {
		Name n =new Name();
		System.out.println(n.age);
		n.Display();
	}

}

class Name {
	int age =56;
  void Display() {
		System.out.println("hello my name is rohan");
	}
}
