package topic16.finalAndBlocks;

public class Program3 {
	final static int num1= 9;
	final int num2;
	// by making constructor 
	Program3(){
/*      this is possible as non-static member loaded in memory during object creation at that time 
		only JVM will get to know that variable we final so we can initialize them using constructor 
		as constructor is mainly used to initialize non-static members into the object memory
		--> we can re-initialize non-static final variable from constructor
		*/
		 num2 = 8;
	}

	public static void main(String[] args) {
		System.out.println("num1: "+ Program3.num1);
		Program3 r1 = new Program3();
		 System.out.println("num2: "+ r1.num2);
	}

}
/* Final keyword: - It represented as constant 
* 
* Use:- 
* Variable:- local & global
* Method :- static and non-static
* Class
* 
* * 
* Final variable- this means this variable can't be re-initialized,
* if tried will get compile time error 
* 
* final local variable:- 
*                       it can be declared and initialized before use  
* 
* final global variable :- 
*                       it should be initialized at the time of declaration
*              but, 
*                   non-static global variable
*                     *using constructor:- we can declare them and re- initialization can be done from inside constructor body        
* 
*  final static global variable :-
*                    *using non-static block
*                  

*/