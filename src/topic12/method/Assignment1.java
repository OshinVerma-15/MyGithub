package topic12.method;

public class Assignment1 {

	public static void main(String[] args) {

		// Given number is prime number or not
		primeNumber(25);
	}

	    static void primeNumber(int num) {
		int i=1;
		int count = 0;

		for (; i <= num; i++) {
			if (num % i == 0) {
				count++;

			}

			if (count == 2) {
				System.out.println("This ia a prime number");

			}

			else {
				System.out.println("This is not a prime number");

			}
		}
	}
}
