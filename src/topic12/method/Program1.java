package topic12.method;

public class Program1 {

	public static void main(String[] args) {
		javaprogram();
		
		System.out.println( "*******************************");
	     Program1.javaprogram();
		
		System.out.println("*********************************");
		Program1.javaprogram();
	}
		
		public static void javaprogram() {
		System.out.println("This a java program");
		System.out.println("We are learning method and functions");
		System.out.println("This is 29th jan batch");
		
	}
  // It contains reusable statements 

		
		/*
		 * 1.  Static function can call another static body //
		 *  2. In second, public static main body, so suppose if we make one new body with "methodname" like
		 *       we used taskres here and now we want to call this method from our main body
		 *       so we have to write the mainmethod the main body
		 * 3. Whenever we want to make another main method so we can add "returntype" in "agrument " and 
		 *       put the "methodname with returntype" in main method for desired result 
		 *       
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
		 * 8. Method parameter help us to run each time with different value   
		 **/
}