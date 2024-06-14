package topic12.method;
//Simple interest program
public class Program5 {

	public static void main(String[] args) {
		
		
		//Case1:- 
		//In this case body will be executed but we will not get the result value
		Program5.simpleInt(340000.56, 14, 9);
		// In this case body will be executed and also gives return value
		System.out.println("Interest id: "+ simpleInt(340000.56, 14, 9) ); 
		
		
		//Case2:-
		//body will be executed and return value will be stored in a variable for future use
		double result= Program5.simpleInt(340000.56, 14, 9);
		System.out.println("New result: " + result );
		//3rd case:-
		double finalamount = 890000+ result;
		System.out.println("Final amount: "+ finalamount );
	}
		static double simpleInt(double p, int r, int t) {
			 System.out.println("Given principle: "+ p);
			 System.out.println("Given rate of interest:" + r);
			 System.out.println("Given time period: " + t);
			 
			 return (p*r*t)/100; // Result value
		}

	}
/*In case 1:- First calling :- we will not get return value 
In case 2nd:- Second case:- We can see the amount in console
In case 3rd case: Third calling :- Further changes in any value we use this method 

**/

