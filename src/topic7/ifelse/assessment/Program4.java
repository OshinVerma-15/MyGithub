package topic7.ifelse.assessment;

public class Program4 {

	public static void main(String[] args) {
		int year = 2000;
		if (( year% 4 == 0 && year% 100 !=0) || (year % 400 == 0))
		
		{
			System.out.println("Given year is a leap year: " + year);
		}

		else
		{
			System.out.println(" Given year is not a leap year: " + year);
		}
	}

}
