package topic14.constructor;

public class Program6 {
	int age;
	double salary;
	Program6()
	{
		System.out.println("I am zero param");
	}
	
	Program6(int num)
	{
		System.out.println("I am int param");
		age=num;
	}
	Program6(double sal)
	{
		System.out.println("I am double param");
		salary=sal;
	}
	
	Program6(int num, double sal)
	{
		System.out.println("I am int-double param");
		sal= salary;
		age = num;
	}

	public static void main(String[] args) {
		Program6 ref= new Program6();
		System.out.println("Age: "+ ref.age);
		System.out.println("Salary: "+ ref.salary);
		System.out.println("*****************************");
		Program6 ref1 = new Program6(90);
		System.out.println("Age: "+ ref1.age);
		System.out.println("Salary: "+ ref1.salary);
		System.out.println("****************************");
		Program6 ref2 = new Program6(70.90);
		System.out.println("Age: "+ ref2.age);
		System.out.println("Salary : "+ ref2.salary);

	}

}
