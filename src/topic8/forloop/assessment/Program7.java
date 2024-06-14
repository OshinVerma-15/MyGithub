package topic8.forloop.assessment;

public class Program7 {

	public static void main(String[] args) {
		// Reverse  number
		
		 int rem=0;
		 int rev=0;
		 for(int num=456 ; num!=0; num=num/10)
		 {
			 rem=num%10;
			 rev=rev*10+rem;
		 }
		 
			 System.out.println(rev);
	}

}
