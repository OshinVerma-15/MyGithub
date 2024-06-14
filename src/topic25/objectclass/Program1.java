package topic25.objectclass;

public class Program1 {

	public static void main(String[] args) {
	      Program1 sys = new Program1();
	      System.out.println("I am a explicit toString class : "+ sys.toString());
	      System.out.println("I am a implicit toString class :"+ sys);
	      System.out.println("Hashcode address of hexadecimal value: "+ sys.hashCode());
	      
	      System.out.println("*************************************************************************************");
	      
		  Program1 ref= new Program1();
		  System.out.println("I am a explicit class of Program1 :"+ ref.toString());
		  System.out.println("I am a implicit toString class :"+ ref);
		  System.out.println("Hashcode address of hexadecimal value: "+ ref.hashCode());
		  System.out.println("*************************************************************************************");
		  
		  System.out.println("I am equals method :"+ sys.equals(ref));
		  
	}
	 void Sys() {
		System.out.println("I am a Program1 Class");
	 }
}
 /*
  *  Fully Qualified Class @hexadecimal address ---> predefinedclasses.objectClass.Program1@
  *  ---> package name.classname@heaxadecimal value  - my understanding
  */
