package topic13.methodoverloading;

import topic12.method.Program6;

public class Program1 {
	// To reverse a number
	public static void main(String[] args) {
		Program1 ref = new Program1();
		ref.reverseNumber(567);
		System.out.println("Reverse number is : " + ref.reverseNumber(567));
        System.out.println("Reverse of a new number: "+ ref.reverseNumber());
	}
  //1st method
	int reverseNumber(int num) {
		System.out.println("Given number is : " + num);
		int rev = 0, rem;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev;
	}
	//2nd method 
	          public int reverseNumber() {
	        	  int num=123; //this is second type i.e., different type of parameter
	    System.out.println("Given number is : "+ num);
   	    int rev=0, rem;
   	    while(num!=0) {
   	    	rem= num%10;
   	    	rev= rev*10 + rem;
   	    	num=num/10;
   	    }
   	   //we can call this from for loop also 
   	    for(; num!=0; num=num%10)
   	    {
   	    	rem = num%10;
   	    	rev= rev*10 + rem;
   	    }
   	     return rev;
	          }
}

/*
 * METHOD OVERLOADING:- when we declare same method more than once in a class
 * with different set of parameter than that will be known as method
 * overloading.
 * 
 * 
 * Difference set of parameter:-
 * 1. diff in no.of parameter
 * 2. diff in type of parameter 
 * 3. diff in position of parameter 
 * (They never work together we can use only one condition at a time)
 */
