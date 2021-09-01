//Write two methods with the same name but different 
//number of parameters of different data type and call the methods from main method
package ovrloding;

public class Ovrloding2 {
	public void Display(int a) {
		System.out.println(a+"st method");
		
	}
	public void Display(int b,String c) {
		System.out.println(b+"nd method"+"\n"+c+"rd method");
		
	}


	public static void main(String[] args) {
		Ovrloding2 o=new Ovrloding2();
		o.Display(1);
		o.Display(2,"3");

	}



}
