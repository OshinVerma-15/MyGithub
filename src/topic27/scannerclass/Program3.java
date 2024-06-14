package topic27.scannerclass;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		       Scanner scn = new Scanner(System.in);
		       System.out.println("Enter 1st number :");
		       int num1 = scn.nextInt();
		       System.out.println("Enter 2nd number :");
		       int num2 = scn.nextInt();
		       System.out.println("Operation : ");
		       char sum = scn.next().charAt(0);
		       scannerClass(sum,num1, num2);
	
	}
		static void scannerClass(char sum, int num1, int num2) {
			 System.out.println("Please enter first number :" + num1);
			 System.out.println("Please enter second number :"+ num2);
			 int result = 0;
			 if(sum =='+') {
				 result = num1+num2;
			 }
			 else if(sum =='-') {
				 result= num1-num2;
			 }
			 else if(sum=='*') {
				 result= num1*num2;
			 }
				 
				 System.out.println("Result: "+ result);
			 }
             	}