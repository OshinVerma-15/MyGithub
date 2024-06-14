package topic27.scannerclass;

import java.util.Scanner; //we need to import this in every program  // Cntl+Shft +O --> follow this step for import

public class Program1 {

	public static void main(String[] args) {
               // Class(4,5,90);
		  Scanner scn = new Scanner(System.in);
		  System.out.println("Please enter 1st number:-");
		   int num1=  scn.nextInt();
		   System.out.println("Please enter 2nd number:-");
		   int num2 = scn.nextInt();
		   System.out.println("Please enter 3rd number:-");
		   int num3 = scn.nextInt();
		   System.out.println("Sum of numbers:-");
		   Class(num1,num2,num3);
	}
              static void Class(int num1, int num2 ,int num3) {
            	  int sum = num1 + num2 + num3;
            	  System.out.println("Add number1: "+ num1);
            	  System.out.println("Add number2 :"+ num2);
            	  System.out.println("Add number3 : "+ num3);
            	  System.out.println("Sum of numbers: " + sum);
              }
}