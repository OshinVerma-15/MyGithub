package topic28.stringclass;
//indexing of java using array

public class Program4 {

	public static void main(String[] args) {
		  String s1 = "Core Java Basics";
		  System.out.println("String s1 : "+ s1);
		  System.out.println("Length of string s1 : "+ s1.length());
		  System.out.println("Count no index 3 : "+ s1.charAt(3));
		  System.out.println("*****************************************");
		  
		  // to count no.of char one by one in string we use for loop 
		  for(int i = 0; i<s1.length(); i++) {
			  System.out.println(" String : " + s1.charAt(i));
		  }
		  
		  // for reverse number
		  System.out.println("*********Reverse number*********");
		  String rev="";
		  for(int i =s1.length()-1; i>=0;i--) {
			  rev= rev+s1.charAt(i);
		  }
		  System.out.println("Reverse no. : "+ rev);
		  
		  System.out.println("***************Print String in upper/lowercase*************");
		  System.out.println("String in lowercase : "+ s1.toLowerCase());
		  System.out.println("String in uppercase : " + s1.toUpperCase());
		  System.out.println("String s1 : "+ s1);
		  System.out.println("*********************************");
		  
		  System.out.println("Start of String : "+ s1.startsWith("Core")); //to check start word 
		  System.out.println("End of string : "+ s1.endsWith("Basics"));// to check end word
		  System.out.println("String contains :"+ s1.contains("Java")); // to check our string contains some letter
		  System.out.println("Is string is empty : "+ s1.isEmpty());// to check string is empty
		  
	  }
  }
