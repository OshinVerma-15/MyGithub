package topic8.forloop.assessment;

public class Program8 {
	// Palindrome number

	public static void main(String[] args) {
		int n1=12321,n2,rem,rev=0;
		n2 = n1;
		{
			System.out.println(n1);
		}
		for(n1= 12321; n1!=0; n1=n1/10)
		{
			rem= n1%10;
			rev= rev*10 + rem;
		}
		
			System.out.println(rev);
			
           if (rev==n2)
           {
        	   System.out.println("This is a palindrome function");
           }
           
           else
           {
        	   System.out.println("This is not a palindrome function");
           }
	          }
                 }
