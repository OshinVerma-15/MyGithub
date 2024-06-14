package topic27.scannerclass;

import java.util.Scanner;

//Reverse Number using Scanner class

public class Assignment1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number :");		int num= scan.nextInt();
		scannerClass(num);
	}
		
		static void scannerClass(int num) {			
		int rev = 0;
        int rem = 0;
        while (num!=0) 
        {
            rem = num%10;
            rev = rev*10 + rem;
            num = num / 10;
        }
        
           System.out.println("Reverse of the number :" + rev);
	}
}
