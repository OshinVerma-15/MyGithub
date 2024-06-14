package topic18.abstraction;

	abstract class Sample1{ // 100% abstract class because all methods are non-static abstract
	     abstract void display4();
	     abstract void display5();
	     abstract void display6();
	}
	 class Prog2 extends Sample1{
		 void display4() {
			 System.out.println("Text1");
		 }
	      void display5() {
	    	  
	      }
	   void display6() {   
	   }
	 }  
	   public class Program2 {

	public static void main(String[] args) {
          Prog2 ref= new Prog2();
          ref.display4();
	}
	    }
	        
/* When an abstract class is getting inherited by a sub-class, then there will be a contract between
*  these classes that sub-class needs to override all the abstract method of abstract class(super class) 
*  otherwise sub-class becomes abstract class  
*  
*  
*  Meaning- suppose I have one abstract class and one non abstract class and now abs.class in inherited by non-abs.class
*           in that case I have to provide body to all the methods with override method.
*/