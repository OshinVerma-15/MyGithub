package topic27.scannerclass;

import java.util.Scanner;

// even number between range

public class Assignment4 {

	public static void main(String[] args) {
		  Scanner scn= new Scanner(System.in);
		  System.out.println("Please enter number : ");
		  int num = scn.nextInt();
		  scannerClass(num);
		  
	}
	static void scannerClass(int num) {
		if( num % 2==0)
		{
			System.out.println("Number is divisble by 2 and its even number");
		}
		
		else 
		{
			System.out.println("Number is not divisble by 2 and its a odd number");
		}
	}
}
