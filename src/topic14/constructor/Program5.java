package topic14.constructor;

public class Program5 {
	Program5(int num)
    {   
  	   System.out.println("***I am a zero param constructor***");
  	   age = num;
     }
     
     int age;// non-static global variable
     
	public static void main(String[] args) {
			
	 		Program5 ref = new Program5(90);
	 		System.out.println("Program Starts ");
	 		System.out.println("Age: "+ ref.age);
	 		System.out.println("***************************");
	 		Program5 ref1 = new Program5(89);
	 		System.out.println("New age: " + ref1.age);
	 		System.out.println("Program Ends");

	 	}

	 }


/*    ***************Constructor****************
 * It used to initialize non-static members of the class to create object memory during compilation 
 * 
 * Constructor is always same as classname
 * Constructor is same as method name but it won't have return type;
 * 
 * Constructor:- gets called called automatically when class object is created
 * 
 * Constructor is of 2 types:-
 * 1. Default constructor
 *     in default constructor we don't have to call them it loaded automatically
 *     MOST IMP:- this will be written by java compiler when any class present contain any type of constructor 
 *                It won't have any parameter as well as body will be empty
 *                
 * 2. User defined constructor
 * This will be written by java programmer and have parameter and it will have body as well
 * 
 * 
 * NOTE:- Every java class will have a constructor 
 *
 *  CONSTRUCTOR OVERLOADING:- When we declare more than one constructor in any class with different set of parameters 
 */

