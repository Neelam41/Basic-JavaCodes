
// Programs on Logical AND,OR operator and Logical NOT
package operators;

public class optr5 {

	public static void main(String[] args) {
		// && operator
	    System.out.println((6 > 3) && (8 > 5));  // true
	    System.out.println((6 > 3) && (8 < 5));  // false

	    // || operator
	    System.out.println((5 < 3) || (6 > 5));  // true
	  
	    System.out.println((5 < 3) || (6 > 5));  // true
	    System.out.println((5 < 3) || (6 < 5));  // false

	    // ! operator
	    System.out.println(!(5 == 3));  // true
	    System.out.println(!(5 > 3));  // false

	}

}
