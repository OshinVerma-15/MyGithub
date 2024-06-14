package topic17.Inheritance;

class parentclass
{
	int age= 78;
	static double salary = 25000;
}

   class ChildClass
{
	 int empID= 5001;
	 static double pincode= 890023;
}

public class Program1 {

	public static void main(String[] args) {
		parentclass p1= new parentclass();
		System.out.println("GSV parent class age: " + p1.age);
		System.out.println("Static parent class salary: "+ parentclass.salary);
		ChildClass c1= new ChildClass();
		System.out.println("ChildClass employeeID: "+ c1.empID);
		System.out.println("ChildClass double salary :" + ChildClass.pincode);
			
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
 * To do this we use super() statement, this will help us to call parent class 
 * constructor based on the parameter.
 * Superstatement should be the first statement inside constructor body.

NOTE:- This() statement and super() statement cannot be use together
 *
 * Static member never participate in inheritance
 * **/
