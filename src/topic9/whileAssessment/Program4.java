package topic9.whileAssessment;

public class Program4 {

	public static void main(String[] args) {
		// Armstrong program using while loop using 3 digit number
		
		int num =127, temp, rem, sum=0;
		temp =num;
		while(num!=0)
		{
			rem= num%10;
			sum= sum+(rem*rem*rem);
			num=num/10;
		}
          
		if(temp==sum)
		{
			System.out.println("Given number is a amstrong number: " + temp);
			
			}
		else 
		{
			System.out.println("Given number is not an armstrong number: " + temp);
		}
		}
	}


