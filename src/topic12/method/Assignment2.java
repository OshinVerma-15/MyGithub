package topic12.method;

public class Assignment2 {

	public static void main(String[] args) {
		// Get reverse for a given number
		
		
		 // First method 
		int n1=891;
		System.out.println("Actual number is:"+891);
		System.out.println("Reverse number is:" + reverseNumber(n1));
		
		
		// 2nd method
		Assignment2.reverseNumber(345);
		System.out.println("Get second reverse number: "+ reverseNumber(345));
	}
		      static int reverseNumber(int num) {
		    	  int n1, rev=0, rem;
		    	  while(num!=0) {
		    		  rem= num%10;
		    		  rev= rev*10 +rem;
		    		  num=num/10;
		    	  }
		    	  return rev;
		      }
		

	}

 
