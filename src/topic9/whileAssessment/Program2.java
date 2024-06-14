package topic9.whileAssessment;

public class Program2 {

	public static void main(String[] args) {
		//Reverse of a number using while loop
		   
		int rev = 0;
        int rem = 0;
        int num= 56789;
        
        while (num!=0) 
        {
            rem = num%10;
            rev = rev*10 + rem;
            num = num / 10;
        }
        
        System.out.println("Reverse of the given number: " + rev);
	}

}
