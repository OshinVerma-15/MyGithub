package topic17.Inheritance;
	
     class parentExample1 {
		//Default constructor
		int age= 78;
		static double salary = 25000;
	}
	public class childExample1 extends parentExample1{
	//Default constructor
		// childExample1(){
		//	 super();
		// }
		 int empID= 5001;
		 static double pinCode= 890023;
	
	public static void main(String[] args) {
		childExample1 ref = new childExample1();
		System.out.println("NSGV from parentExample1 class, age: " + ref.age);
		System.out.println("NSGV from childExample1 class, empID"+ ref.empID);
		System.out.println("*************************************************");
		System.out.println("SGV from parentExample1 class, salary: "+ parentExample1.salary);
		System.out.println("SGV from childExample1 class, pincode: "+ childExample1.pinCode);
	}

}
/* Inheritance:- 
* When a class acquires the property of another class is called inheritance
* 
* Parent/ Super/ Derived Class:- Class from where members are getting inherited
* Child/Sub-class/Inherited class:- Class to whom members are getting inherited
* 
* Represent:- class childClassName extends parentClassName
* 
* How:- To achieve this we use constructor chaining, when child 
* class constructor calls parent class constructor and parent class
* constructor calls its parent class constructor known as constructor chaining.
* 
* *******To do this we use super() statement, this will help us to call parent class******
* constructor based on the parameter.
* 
* Super() should be the first statement inside constructor body.

NOTE:- This() statement and super() statement cannot be use together
*
* Static member never participate in inheritance
**/
