package topic16.finalAndBlocks;

public class Program2 {
	  final static int num1 =9;// this line will give error after adding final as static global should initialized during declaration 
        final int num2=8;//this line will give error after adding final as non-static global should initialized during declaration
	public static void main(String[] args) {
		
		final int age; // declare 
		System.out.println(" Age > 18 ");
		age =18;// initialize
     
		final int vote; // declare
		System.out.println(" Vote for party ");
		vote = 1;// initialize
		
		// num1 = 6; // because we have initialized as final variable so it cannot be re-initialized
		System.out.println(" SGV : "+ Program2.num1);
		Program2 r1 = new Program2();
		System.out.println(" NSGV : " + r1.num2);
		// r1.num2 = 6;// because we have initialized as final variable so it cannot be re-initialized
	}

}
/* Final keyword: - It represented as constant 
 * 
 * Use:- 
 * Variable:- local & global
 * Method :- static and non-static
 * Class
 * 
 * final local variable:- 
 *                       it can be declared and initialized before use 
 * 
 * final global variable :- 
 *                       it should be initialized at the time of declaration
 * 
 * 
 * Final variable- this means this variable can't be re-initialized,
 * if tried will get compile time error 
 */
