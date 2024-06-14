package topic28.stringclass;

public class Program5 {

	public static void main(String[] args) {
		String s2 = "Java Selenium Classes Evening Batch";
		  System.out.println("String s2 : "+ s2);
		  System.out.println("Length of string s1 : "+ s2.length());

	  System.out.println("Start of String : "+ s2.startsWith("Core")); //to check start word 
	  System.out.println("End of string : "+ s2.endsWith("Batch"));// to check end word
	  System.out.println("String contains :"+ s2.contains("Java")); // to check our string contains some letter
	  System.out.println("Is string is empty : "+ s2.isEmpty());// to check string is empty
	  
	  System.out.println("********************SubString***********************");
	  String s1= s2.substring(5);// this will start from index 5
	  System.out.println("String from index 1 : "+ s1);
	  String s3= s2.substring(5,13);
	  System.out.println("String from index 5 to 13 : "+ s3);//start index will be included and last index will be excluded
	  
	  System.out.println("*********************Split*********************");
      String[] s4 = s2.split(" ");
      for(String str:s4) {
      System.out.println("String after split : "+ str);
      }
      
      String[] s5 = s2.split(" ", 3);
      for(String str1: s5) {
    	  System.out.println("String after split in index 3 : "+ str1);
      }
      
      System.out.println("*************************************************");
      String s6 = "I am java student, I am learning Java, I am learning Selenium";
      String[] s7 = s6.split("am");
      for(String str2:s7) {
    	  System.out.println("Print String on basis of 'am': " +str2);
      }
      System.out.println("*************************************************"); 
      String[] s8 = s6.split("am", 3);
      for(String str3 : s8) {
    	  System.out.println("Split String on 2 parts : "+ str3);
      }
        }
          }