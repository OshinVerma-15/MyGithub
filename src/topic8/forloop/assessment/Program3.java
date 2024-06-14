package topic8.forloop.assessment;

public class Program3 {

	public static void main(String[] args) {
		// Display sum of N natural numbers
		
		int num= 10,sum = 0;  // here we are using sum to store value 
		
        for(int i=1;i<=num;i++)
        {
        	sum= sum+ i;
        }
        	System.out.println("sum of 10 numbers: " + sum);
        }
	

}
