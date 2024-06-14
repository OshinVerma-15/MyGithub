package topic12.method;

public class Program3 {

	public static void main(String[] args) {
		// To check the number is even or not
		int n1=3;
		System.out.println("Given number is: "+ n1);
		Program3.evenOrOdd(n1);
	}
		
		  static void evenOrOdd(int num) { //method(void)- no value
			 if (num % 2 == 0)
			 {
				 System.out.println("It is a even number: " + num);
			 }
			 else
				 System.out.println("It is not a even number: " + num);
		}
	}

 /*1.  Static function can call another static body 
 * 2. In second, public static main body, so suppose if we make one new body with "methodname" like
 *       we used taskres here and now we want to call this method from our main body
 *       so we have to write the mainmethod the main body
 * 3. Whenever we want to make another main method so we can add "returntype" in "argument " and 
 *       put the "methodname with returntype" in main method for desired result  
 *       
 * 4. Drawback:- we will always use making returntype in argument rather than declaring it in local variable because 
 *               local variable can only be access for one time but in argument we can give no.of input
 * 5. We can use returntype multiple time in argument but we can use only a single time when we use local variable   
 * 6. There is limit in local variable bit there is no limit in argument 
 * 
 *  
 * 7. When we use the first statement(in which we use local variable)  ? 
 *    When we know that this value is definite this will not change this value will remain same
 *    
 * 8. Advantage of parameter:- Method parameter help us to run each time with different value   
 **/