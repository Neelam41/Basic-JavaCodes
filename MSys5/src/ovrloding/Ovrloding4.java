//4. Write two methods with the same
//name and same number of parameters of different type 
//and call from main method
package ovrloding;

public class Ovrloding4 {

	public void Display(int a,boolean p) {
		System.out.println(a+"st method "+p);
		
	}
	public int Display(int b,String c) {
		System.out.println(b+"nd method"+"\n"+c+"rd method");
		return b;
	}


	public static void main(String[] args) {
		Ovrloding4 o=new Ovrloding4();
		o.Display(1,true);
		System.out.println(o.Display(2,"3"));

	}


}
