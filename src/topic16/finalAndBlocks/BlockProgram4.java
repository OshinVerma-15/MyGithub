package topic16.finalAndBlocks;

public class BlockProgram4 {
	static int age;
	double salary;

	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("*********************************");
		BlockProgram4 b1 = new BlockProgram4();
		System.out.println("********************************");
		BlockProgram4 b2 = new BlockProgram4();
		System.out.println("********************************");
		System.out.println("Program Ends");
	}
	static {
		System.out.println("This is my first line");
	}
	static { //static
		display();//0
		System.out.println("This is my age block");
		age = 90;
		display();
		}
	{  // non static
		calling();//0.0
		System.out.println("I am non-static block-1 with salary");
		salary = 88.90;
		calling();
	}
	{
		System.out.println("I am non-static block-2");
	}

	BlockProgram4() {
		System.out.println("I am constructor body");
	}

	private void calling() {
		System.out.println("I am non-static double salary value: " + salary);
	}

	private static void display() {
		System.out.println("I am static int age value: " + age);
	}
}
