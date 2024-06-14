package topic8.forloop.assessment;

public class Program9 {

	public static void main(String[] args) {
		// Prime number
		
		int num=2, ct= 0;
		for (int i=1; i<=num; i++)
		{
			if (num%i ==0)
			{
				ct++;
			}
			
			if (ct==2)
			{
				System.out.println("This is a prime number" + num);
			}
			else
			{
				System.out.println("This is not a prime number" );
			}
		}

	}

}
