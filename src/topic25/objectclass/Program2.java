 package topic25.objectclass;

public class Program2 {

	public static void main(String[] args) {
		      Program2 sys = new Program2();
		      System.out.println("I am a explicit toString class : "+ sys.toString());
		      System.out.println("I am a implicit toString class :"+ sys);
		      System.out.println("Hashcode address of hexadecimal value: "+ sys.hashCode()); 
		      System.out.println("*************************************************************************************");
		      
			  Program2 ref= new Program2();
			  System.out.println("I am a explicit class of Program1 :"+ ref.toString());
			  System.out.println("I am a implicit toString class :"+ ref);
			  System.out.println("Hashcode address of hexadecimal value: "+ ref.hashCode());
			  System.out.println("*************************************************************************************");
			  
			  System.out.println("I am equals method :"+ sys.equals(ref));
			  System.out.println("*************************************************************************************");
              
			  Program2 ref1 = ref;   // Comparing new object with existing object
			  System.out.println("I am a implicit toString class :"+ ref1);
			  System.out.println("I am a hexadecimal value: "+ ref1.hashCode());
			  System.out.println("I am equals method :"+ ref1.equals(ref)); 
	   }
	}

