package topic23.array;
//Program to find average of numbers
public class ArrayExample4 {

	public static void main(String[] args) {
		int [] num= {4,9,20,35};
		double sum =0;
		double average;
		
		for(int number : num) {
			//sum = sum+ number; // 4+9+20+35
			      //OR
			sum += number;// += will write without space or else it will give error
			// we will get the  sum of numbers 
		}
			System.out.println("Length of array: "+ num.length);
			average = sum/num.length;
			System.out.println("Sum of numbers:" + sum);
			System.out.println("Average of numbers: "+ average);
		}
	}
