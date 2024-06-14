package topic14.constructor;

public class Program3 {

	Program3(int num)
    {   // Use defined constructor
 	   System.out.println("***I am a param constructor***");
 	   age = num;
    }
    
    int age;// non-static global variable
    
	public static void main(String[] args) {
		
		Program3 ref = new Program3(56);  // error :- Program3 ref = new Program3(); 
		System.out.println("Program Starts ");
		System.out.println("Age: "+ ref.age);
		System.out.println("Program Ends ");

	}

}

/* This will throw error on line no.15 as when constructor we used was default,
when it is called, it will go to Program3 constructor and check than it will find there is a paramter "int" present inside constructor 
class so this will throw error until we dont pass the parameter value(value of int) ie,(value of any returntype) in line15**/



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
 * CONSTRUCTOR OVERLOADING:- When we declare more than one constructor in any class with different set of parameters 
 */

