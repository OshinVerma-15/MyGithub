package topic12.method;

public class Program7 {

	public static void main(String[] args) {
		// To check number is palindrome or not
		
		     Program7 ref = new Program7();
		     ref.checkPalindrome(1258);
		     ref.checkPalindrome(121);
		     System.out.println("Given number palindrome: "+ ref.checkPalindrome(121));
		     System.out.println("Given number is : "+ ref.checkPalindrome(1258));
		     
	}
               int checkPalindrome(int num) {
            	   System.out.println("Given number is: "+ num);
            	   int rev=0, rem , temp=num;
            	    while(num!=0) {
            	    	
           	    	rem= num%10;
            	    	rev= rev*10+ rem;
            	    	num=num/10; 
            	    }
            	    if(temp==rev) {
            	    	System.out.println("this is palindrome number");
            	    }
            	    else {
            	    	System.out.println("This is not a palindrome number");
            	    }
                              return temp;
               } 
}
