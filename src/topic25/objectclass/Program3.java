package topic25.objectclass;
//override method
public class Program3 {

	public static void main(String[] args) {
		  Program3 sys = new Program3();
	      System.out.println("I am a explicit toString class : "+ sys.toString());
	      System.out.println("I am a implicit toString class :"+ sys);
	      System.out.println("Hashcode address of hexadecimal value: "+ sys.hashCode()); 
	      System.out.println("*************************************************************************************");
	      
		  Program3 ref= new Program3();
		  System.out.println("I am a explicit class of Program1 :"+ ref.toString());
		  System.out.println("I am a implicit toString class :"+ ref);
		  System.out.println("Hashcode address of hexadecimal value: "+ ref.hashCode());
		  System.out.println("*************************************************************************************");
		  
		  System.out.println("I am equals method :"+ sys.equals(ref));
		  System.out.println("*************************************************************************************");
          
		  Program3 ref1 = ref; // Comparing new object with existing object
		  System.out.println("I am a implicit toString class :"+ ref1);
		  System.out.println("I am a hexadecimal value: "+ ref1.hashCode());
		  System.out.println("I am equals method :"+ ref1.equals(ref)); 
	}
	     /* public String toString() {
	    	  return "xyz";
	      }*/
	      public int hashCode() {
	    	  return 300;
	      }
	     public boolean equals(Object obj) {
	    	 return true;
	    	 
	     }
}
 