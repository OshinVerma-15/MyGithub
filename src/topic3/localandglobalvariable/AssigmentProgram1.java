package topic3.localandglobalvariable;

//Initialize num1 and num2 with new value using new instance, perform division and store value in result
//Initialize num1 and num2 with new value using new instance, perform division and swap their value and print them
         
public class AssigmentProgram1 {
	
	int num1, num2, num3, num4;
	static int result;

	public static void main(String[] args) {
		
		AssigmentProgram1 ref= new AssigmentProgram1();
		
		ref.num1= 10;
		ref.num2= 2;
		result= ref.num1/ref.num2;
		
		System.out.println("Division of 2 numbers is: "+ AssigmentProgram1.result );
		
        // swapping program with help of 3rd variable
		
		ref.num1= 8;
		ref.num2=6;
		result= ref.num1;
		ref.num1= ref.num2;
		ref.num2= result;
		System.out.println("swapping no. of num1 will be: "+ ref.num1);
		System.out.println("swapping no. of num2 will be: "+ ref.num2);
		
		//apart from result swap no.s without help of result i.e, 3rd variable
		 AssigmentProgram1 ref1 = new AssigmentProgram1();
		
		ref1.num3 = 10;
		ref1.num4= 20;
		ref1.num3 = ref1.num3 + ref1.num4;
		ref1.num4 = ref1.num3 - ref1.num4;
		ref1.num3 = ref1.num3 - ref1.num4;
		
		System.out.println("swapping no. of num3 will be: "+ ref1.num3);
		System.out.println("swapping no. of num4 will be: "+ ref1.num4);
		
		
		
		
	}

}
