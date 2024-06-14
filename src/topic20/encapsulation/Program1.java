package topic20.encapsulation;

class AutomationClass{
	// these are private member and can be accessed only inside the class
	private int age = 10;
	private double salary = 30000;
	
	/*
	 * getter :- create a public method
	 *       return type: should be same as required private variable
	 *       return value: should be required private variable
	 *       NOTE :- Using Getter methods class members are READ ONLY, we can only access them outside the class 
	 */
	public int getAge() {
		 return age;
	}
	public double getSalary() {
		 return salary;
	}
}
public class Program1 {

	public static void main(String[] args) {
		// access the non-static member of the class
		AutomationClass ref = new AutomationClass();
		
		//In this case we cannot access these members outside the class as these are private members
		//System.out.println("Private member of age :"+ ref.age);
		//System.out.println("Private member of salary :"+ ref.salary);
		
		System.out.println("Getting private variable age by using getter method : "+ ref.getAge());
		System.out.println("Getting private variable salary by using getter method : "+ ref.getSalary());
	}
      }
