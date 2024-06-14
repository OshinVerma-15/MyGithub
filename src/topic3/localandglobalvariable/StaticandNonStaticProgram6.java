package topic3.localandglobalvariable;
 
public class StaticandNonStaticProgram6 {
	
	static int num1, num2; 
	int result;

	public static void main(String[] args) {

		 System.out.println("Value of static variable num1: "+ StaticandNonStaticProgram6.num1);
		 System.out.println("Value of static variable num2: "+ StaticandNonStaticProgram6.num2);
		 StaticandNonStaticProgram6 ref = new StaticandNonStaticProgram6();
		
		 StaticandNonStaticProgram6 ref2= new StaticandNonStaticProgram6();
		 System.out.println("Nonstaticglobalvariable: " + ref.result);
		
		 
		 num1= 10;
		 num2= 15;
		 ref.result = num1 + num2;
		 System.out.println("Addition of numbers num1+ num2 for ref1: "+ ref.result);
		 
		
		 
		 num1 = 9;
		 num2 = 9;
		 ref2.result = num1 + num2;
		 System.out.println("Addition of numbers num1+ num2 for ref2:" + ref2.result);
		 
	}

}
