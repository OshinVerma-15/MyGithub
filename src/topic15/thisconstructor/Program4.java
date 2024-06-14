package topic15.thisconstructor;
class ManualTesting{
static int age =90;

// static global and local variable
	static void display()
    {
		System.out.println("Static GSV: "+ age);
	}
    static void display(int age)
    {
    	System.out.println("Number: "+ age);
    }
    
    // non-static global and local variable
	 double salary=67.68;
	   
	 void calling() {
		 System.out.println("Salary calling() :"+ salary);
	 }
	 
	 void calling(double salary) {
		 //ManualTesting ref = new ManualTesting();
		 System.out.println("Salary from double: "+ salary);
		 System.out.println("Calling salary from this keyword :"+ this.salary);	 
		 
		/* void calling (int salary) {
			 ManualTesting ref1= new ManualTesting();
			 System.out.println("Int num value():" + salary);
			 System.out.println("Int salary:" + ref1.salary);**/
			 
		 
		 
		 // This condition
		 this.salary = salary;
		 System.out.println("Salary :"+ salary);
		 System.out.println("salary GSV: "+ this.salary);
		 System.out.println("**********************************");
		 salary = this.salary;
		 System.out.println("Salary : "+ salary);
		 System.out.println("Salary gsv :"+ this.salary);
		 
	 }
}
    public class Program4 {
	
	public static void main(String[] args) {
                   ManualTesting.display();
                   ManualTesting.display(67);
                   ManualTesting ref = new ManualTesting();
                   ManualTesting ref1= new ManualTesting();
                   ref1.calling(7);
                   ref.calling();
                   ref.calling(67.67);
                   
                   
	}

}
