package topic12.method;
//Check number is Palindrome or not

public class Assignment3 {

	public static void main(String[] args) {
		int n1= 121;
		System.out.println("Orignal number is: "+ n1);
		System.out.println("Palindrome number is: "+ Assignment3.checkpalindrome(n1));
		
	}
	static int checkpalindrome(int num) {
		    
		int rev=0, rem, temp=num;
		while(num!=0) {
			rem=num%10;
			rev=rev*10 + rem;
			num=num/10;
		}
		if (temp==rev) {
			System.out.println("Given number is palindrome" );
		}
         
		else {
			System.out.println("Given number is not palindrome" );
		}
		return temp;
	}

}
