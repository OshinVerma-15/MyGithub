package topic12.method;

//Write a program to get reverse of a number
public class Program6 {

	public static void main(String[] args) {
		// creating object to load non-static members of the class on object memory
		Program6 ref = new Program6();
		ref.getRevrseNumber(123);
		System.out.println("Reverse number is : " + ref.getRevrseNumber(123));

	}

	    int getRevrseNumber(int num) {
		System.out.println("Given number is :" + num);
		int rev = 0, rem;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		return rev;
	}
}
