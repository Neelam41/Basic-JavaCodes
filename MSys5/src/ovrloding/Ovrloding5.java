
//Write two methods with the same name,
//number of parameters and data type but different return Type.
package ovrloding;

public class Ovrloding5 {
	public void Display(int a,boolean p) {
		System.out.println(a+"st method "+p);
		
	}
	public String Display(int b,String c) {
		System.out.println(b+"nd method"+"\n"+c+"rd method");
		return c;
		
	}


	public static void main(String[] args) {
		Ovrloding4 o=new Ovrloding4();
		o.Display(1,true);
		System.out.print(o.Display(2,"3"));

	}


}
