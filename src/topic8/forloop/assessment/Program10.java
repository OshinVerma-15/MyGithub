package topic8.forloop.assessment;

public class Program10 {

	public static void main(String[] args) {
		// Factor of positive number

		int num = 10;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) // 10 divide by 1,2,5,10
			{

				System.out.println("This is a factor of positive number: " + i);
			}

		}
	}

}
