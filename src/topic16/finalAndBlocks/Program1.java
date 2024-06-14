package topic16.finalAndBlocks;

public class Program1 {

	public static void main(String[] args) {
		final int age = 9;// because of final variable it is giving error
		System.out.println("First Age: " + age);
//		   age = 10;
//		System.out.println("Second age: " + age);
//		  age = 23;
//		System.out.println("Third age: " + age); // we have to comment all the variable because we have declared it as final

	}

}
 /* Final keyword: - It represented as constant 
  * 
  * Use:- 
  * Variable:- local & global
  * Method :- static and non-static
  * Class
  * 
  * final local variable:- it can be declared and initialized before use 
  * 
  * Final variable- this means this variable can't be re-initialized,
  * if tried will get compile time error 
  */
