package topic3.localandglobalvariable;

public class LocalGlobalProgram7 {
	
	int num1, num2;
	static int result;

	public static void main(String[] args) {
	
		LocalGlobalProgram7 ref = new LocalGlobalProgram7();
        ref.num1 = 23;
        ref.num2= 37;
        System.out.println("Value of ref 1: " + ref.num1);
        System.out.println("Value of ref 2: " + ref.num2); 
        result = ref.num1 + ref.num2;
        System.out.println("Final value result of two numbers is: " + LocalGlobalProgram7.result);
        
        
        // reinitialize again num1 and num2 with new object
        LocalGlobalProgram7 ref2 = new LocalGlobalProgram7();
        ref2.num1= 30;
        ref2.num2=90;
        result= ref2.num1 % ref2.num2;
        System.out.println("Modulous of 2 numbers is: "+ LocalGlobalProgram7.result);
	}

}
