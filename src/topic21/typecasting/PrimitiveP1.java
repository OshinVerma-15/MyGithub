package topic21.typecasting;

// variable widening and narrowing
public class PrimitiveP1 {

	public static void main(String[] args) {
		int age =10; // homogeneous statement
        double agevalue = age; // widening --> implicit
        float age_value = age; // widening -->implicit
        System.out.println("Age: "+ age);
        System.out.println("Double age: "+ agevalue);
        System.out.println("Float value: "+ age_value);
        
        System.out.println("*************************");
        double salary = 87.899;
        float sal1 = (float) salary;// narrowing--> explicit 
        int sal2 = (int)salary; // narrowing --> explicit
        System.out.println("Salary : "+ salary); // value will remain same
        System.out.println("sal1: " +sal1 ); // loss in size
        System.out.println("sal2: "+ sal2); // loss in size + loss in data
         
        addition(25,19);// 25= int , 19 = int       //36line
        addition(20.34f, 6); // implicit widening    //36line
        
        System.out.println(getSum(10,25));// 28 line
	} 

    public static int getSum(double num1, double num2){ // widening-- implicit
     System.out.println("***********************************");
	  System.out.println("Number1: "+ num1);
	 System.out.println("Number2: "+ num2);
	 double sum = num1 + num2; // narrowing-- explicit
	 return(int)sum;
}
        // method widening and narrowing
         public static void addition(double num1, int num2) {// widening-- implicit 
        	 System.out.println("***********************************");
        	 System.out.println("Number1: "+ num1);
        	 System.out.println("Number2: "+ num2);
        	 double sum = num1 + num2; // narrowing-- implicit
        	 System.out.println("Sum : "+ sum);
         }
         
	
}    
