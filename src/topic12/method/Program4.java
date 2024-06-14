package topic12.method;

public class Program4 {
	// To check whether number is even or not

	public static void main(String[] args) {
		int n1= 4;
		System.out.println("Given number is : "+ n1);
		//I won't get method return value in the console
		
	//1st method
		Program4.EvenOrOdd(n1);
		//I will be able to print return value of the method in the console
		System.out.println("Result:"+ Program4.EvenOrOdd(n1));
		
		//2nd method
		boolean res= Program4.EvenOrOdd(n1);
		System.out.println("Result of number either even or odd: "+ res);
	}
	
		static boolean EvenOrOdd(int num) { 
			boolean res;
			if(num%2==0) {
				 res=true;
			}
			else {
				res= false;
			}
			return res;	
		}		
	} 
		
/*
 * 1.  Static body can call another static body //
 * 2. In second, public static main body, so suppose if we make one new body with "methodname" like
 *       we used taskres here and now we want to call this method from our main body
 *       so we have to write the mainmethod the main body
 * 3. Whenever we want to make another main method so we can add "returntype" in "argument " and 
 *       put the "methodname with returntype" in main method for desired result     
 * 4. Drawback:- we will always use making returntype in argument rather than declaring it in local variable because 
 *               local variable can only be access for one time but in argument we can give no.of input
 * 5. We can use returntype multiple time in argument but we can use only a single time when we use local variable   
 * 6. There is limit in local variable but there is no limit in argument 
 * 
 *  
 * 7. When we use the first statement(in which we use local variable)  ? 
 *    When we know that this value is definite this will not change this value will remain same
 *    
 * 8. Method parameter help us to run each time with different value   
 **/
