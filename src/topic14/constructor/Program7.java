package topic14.constructor;

public class Program7 {
	static int num =10; // static variable
	int age=39; // non-static variable
	
	void display() // constructor
	{
		System.out.println("Age: "+ age);
	}
	void display(int age)
	{
		    System.out.println("age: " + age );
		    Program7 r1 = new Program7();
		    System.out.println("AGE :"+ r1.age);
		    
	}

	public static void main(String[] args) {
		
		   System.out.println("Global integer value: "+ num);
		   int num= 56;
		   System.out.println("Local integer value: "+ num);
		   Program7 ref = new Program7();
		    ref.display(); // Constructor 
		   System.out.println("Non static variable age:"+ ref.age);
		     
		   Program7 r2= new Program7();
		   Program7 r1 = new Program7();
		         r2.display(89);
		         r1.display(77);
		         
		   
		   

	}

}
     /* this happens because java execute the program line by line
      in line 8 it will print static int value ie 10;
      but in line no.10 it will print the local value ie 56; **/
