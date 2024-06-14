package topic4.operators;

public class OperatorLogicalProgram {

	public static void main(String[] args) {
		
		//OR Condition
		
		int num1 = 12;
		int num2 = 23;
		boolean result1 = (num1 < num2);
		boolean result2 = ( num1 >= num2);
		
		boolean result3 = result1 || result2;
		System.out.println("Result of OR condition:" + result3);
		
		// && Condition 
		
		int num3 = 12;
		int num4 = 23;
		boolean result4 = (num3 < num4);
		boolean result5 = ( num3 >= num4);
		boolean result6 = result4 && result5;
		System.out.println("Result of && condition:" + result6);
        
	}

}
