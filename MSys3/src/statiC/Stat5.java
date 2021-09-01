//5. Call static methods in instance methods
package statiC;

public class Stat5 {

	static String s="Ravi Kumar Dahiya";
	
	public static void Print1() {
	
		System.out.println(Stat5.s ); 	
	
	}
	public void Print() {
		System.out.println("Wrestling (57 KG) Silver Medallist");
		Stat5.Print1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stat5 st=new Stat5();
        st.Print();
	}
}
