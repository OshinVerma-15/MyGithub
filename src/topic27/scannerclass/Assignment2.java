package topic27.scannerclass;
//palindrome number

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner scnn= new Scanner(System.in);
		System.out.println("Please enter number :");
		int n1 = scnn.nextInt();
		scanClass(n1);
	}
	
	  static void scanClass(int n1) {
		int n2,rem,rev=0;
			n2 = n1;
			{
				System.out.println(n1);
			}
			for(; n1!=0; n1=n1/10)
			{
				rem= n1%10;
				rev= rev*10 + rem;
			}
			
				System.out.println(rev);
				
	           if (rev==n2)
	           {
	        	   System.out.println("This is a palindrome function");
	           }
	           
	           else
	           {
	        	   System.out.println("This is not a palindrome function");
	           }
	             }
                   }
