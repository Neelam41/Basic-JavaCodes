//Define the local and Global 
//variables with the same name and print both variables and understand the scope of the variables
package BASICS;

public class Basics5 {

	 int a=10;  //instance variable
	 static int e=23; //static variables
	 
	 private int add() {
			int b=20,c=30; //local variables
			
		return a+b+c;
			
		}
	 
	 
	 private int sub() {
		 int d=50;
	 //System.out.println(c); ---Error(Since local variables can be accessed within its method)
		 
		return d-a ;
		 
	 }
	
	public static void main(String[] args) {
	
		Basics5 Bs=new Basics5();
        //System.out.println(a); --Can be access by using object reference name
		System.out.println(Bs.a);
		System.out.println(Bs.add());
		System.out.println(Bs.sub());
		
		// Static variables can be accessed by 3 different ways
		
		System.out.println(Basics5.e);            
		System.out.println(Basics5.e);                
		System.out.println(e);                 

	}
	

}
