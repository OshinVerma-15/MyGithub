package topic28.stringclass;

public class Program6 {

	public static void main(String[] args) {
		String s1= new 	String("Selenium"); // 2 Object will be created - 1.SCP 2.NSCP
		
	       System.out.println("String s1 : "+ s1);	// this will bring object from NSCP
	       
	       String s2= s1.intern();// this will bring object from SCP
	       System.out.println("String s3 : "+ s2);
	}

}
