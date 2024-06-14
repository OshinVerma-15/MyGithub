package topic15.thisconstructor;

public class Program1 {
	int age =90; // Non-static global variable
	    void check(int age)
	    {
		 System.out.println("AGE : "+ this.age);
		 System.out.println("This keyword : "+ this);
		 this.calling();
	    }
	         void calling()
	    {
	    	 System.out.println("I am calling........... ");
	    	   
	    }
	         
	         void calling(int age)
	         {
	        	System.out.println("I am int-param: " + this.age);
               	 
	         }
	
	public static void main(String[] args) {
		
	         //System.out.println("Age: "+ age);
	         //System.out.println("AGE: "+ ref.age);
	        // System.out.println("AGE: "+ this.age);// this is giving error this a static method
		
		         Program1 ref= new Program1();
		            ref.calling(9);
		            System.out.println("Check ref: "+ ref.age);
		     }
       }


/* THIS KEYWORD:- 
 * 1. this is a object/instance of a current class
 * 2.it is use to access non-static members of the class
 * 3. It use to access the non-static method or constructor
 * 
 * IMPORTANT
 * 4. When will use THIS KEYWORD:- we use this keyword when we have program having non- static global
 *                                 variable and local variable same name present in the class
 



**/