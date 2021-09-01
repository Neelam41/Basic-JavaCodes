//Write two methods with the same name but different 
//number of parameters of same type and call the methods from main method
package ovrloding;

public class Ovrloding {
	public void Display(int a) {
		System.out.println(a+"st method");
		
	}
	public void Display(int b,int c) {
		System.out.println(b+"nd method"+"\n"+c+"rd method");
		
	}


	public static void main(String[] args) {
		Ovrloding o=new Ovrloding();
		o.Display(1);
		o.Display(2,3);

	}

}
