package topic25.objectclass;
    //Constructor

public class Program6 extends Demo {
	static int last_roll= 100;
	int roll_no;
	      // Constructor call
          Program6(){
        	  roll_no = last_roll;
        	  last_roll++;
        	  
          }
	public static void main(String[] args) {
		    Program6 ref = new Program6();
		    System.out.println("I am toString method : "+ ref.toString()); // explicit
		    System.out.println("I am implicit method: "+ ref); // implicit
		    System.out.println("I am hashchode method : "+ ref.hashCode());		
		    
		    Demo d1 = new Demo();
		    System.out.println("I am toString method : "+ d1.toString()); // explicit
		    System.out.println("I am implicit method: "+ d1); // implicit
		    System.out.println("I am hashchode method : "+ d1.hashCode());	
		    System.out.println("I am equals method: "+ ref.equals(d1));
	}

}
