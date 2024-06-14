package topic18.abstraction;

/* Abstract Class is incomplete class and we cannot makes its instance
 *    Normal class consist of  :-
 *      Variable 
 *       Method - static / non-static method
 *                1. non static method abstract ---> in this we have only declaration
 *                2. non-static method
 *        Block 
 *         Constructor
 */
  class abstraction{ // normal class
	   
  }
   
  abstract class Prog1{ // this is abstract class (abstract method / incomplete method)
	  abstract void print(); // in this we will not use curly brackets.
	  
	  void display() { // normal or non-abstract class / concrete class or complete class)
		 System.out.println("I am display method and complete class "); 
		 // this class has 1 non-static and 1 non-static abstract class so we can say this is 50% abstract class
	  }
	  
  abstract class Prog2{ // 0% abstract class because both are non-static class
		  void display2() {
			  System.out.println("I am display method-2 and complete class");
		  }
		  void display3() {
			  System.out.println("I am display method-3 and complete class");
		  }
	  }
   abstract class Prog3{ // 100% abstract class because all methods are non-static abstract
	     abstract void display4();
	     abstract void display5();
	     abstract void display6();
   }
  }
public class Program1 {

	public static void main(String[] args) {

	}

}


/*
 * Abstraction:- Class which is incomplete and we cannot make its object, this can be 0-100% abstract
 *  It will have:-
 *     - abstract method----> keyword declared with abstract without body
 *     - non-abstract method- normal non-static method/ complete method
 *     - static method
 *     - global variable
 *     - constructor
 *     
 * If any class contains atleast one abstract method than this class is declared as abstract class 
 *   
 * When an abstract class is getting inherited by a sub-class, then there will be a contract between
 * these classes that sub-class needs to override all the abstract method of abstract class(super class) 
 * otherwise sub-class becomes abstract class
 *   
 */
