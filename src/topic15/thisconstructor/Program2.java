package topic15.thisconstructor;

public class Program2 {
	Program2() {
				
		System.out.println("************I am zero param");
	}

	Program2(int num) {
		this(2.2);
		
		System.out.println("**************I am int param");
	}

	Program2(double sal) {
		this();
		
		System.out.println("***************I am double param");
	}

	public static void main(String[] args) {
            Program2 ref = new Program2(6);
	} 

}

/*
 * this statement() :- 
 * this should be the first line of the constructor it is
 * use to call another constructor of another class based on the paramtete
 * this should be inside the constructor body 
 **/

//int, zero, double
// zero, double ,int