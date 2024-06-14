package topic16.finalAndBlocks;

public class BlockProgram5 {
	final static int age;
	final double salary;

	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("******************");
		System.out.println("Value of int age :"+ age);
		BlockProgram5 p1 = new BlockProgram5();
		System.out.println("Value of salary :"+ p1.salary);
		System.out.println("******************");
		System.out.println("Program Ends");
	}

	static { // static
		System.out.println("This is my age block");
		age = 90;
	}
	{ // non static
		System.out.println("I am non-static block-1 with salary");
		salary = 88.90;

	}
}