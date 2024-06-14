package topic27.scannerclass;
//prime numbers

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter number: ");
		int num = scn.nextInt();
		scaClass(num);	
	}
	    
	static void scaClass(int num) {
		int ct= 0;
		for (int i=1; i<=num; i++)
		{
			if (num%i ==0)
			{
				ct++;
			}
			
			if (ct==2)
			{
				System.out.println("This is a prime number: " + num);
			}
			else
			{
				System.out.println("This is not a prime number: " + num );
			}
		      }
		        }
	              }

