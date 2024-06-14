package topic5.conditionstatements;

public class IfElseConditionsEx3 {

	public static void main(String[] args) {
		
		//Nested Condition
	 int age = 19;
	 char bloodGroup = 'B';
	 
	 if (age >18)
		 if (bloodGroup == 'B')
	   {
		  System.out.println("Then only applicable to donate blood because of blood with age group"); 
	   }
	 
	 else
	   {
		  System.out.println("Then not applicable to donate blood because of bloodGroup");
	   }
	
	 else
	 {
		 System.out.println("Then not applicable to donate because of age group");
	 }
	    } 
           }
