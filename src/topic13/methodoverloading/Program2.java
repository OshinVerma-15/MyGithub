package topic13.methodoverloading;
//Addition of 2 numbers
public class Program2 {
	
		static void main() {      // THIS LINE INDICATES THAT MAIN METHOD CAN BE OVERLOADED                              
			System.out.println("I am main loaded method");
		}
	

	public static void main(String[] args) {
		addNumber(12, 13.56f); // line no 37 will be executed
		addNumber(12,11); // line 23 will be executed
		addNumber();// line 16 will be executed 
		main();
	}

	static void addNumber() {
		int num1 = 19, num2 = 20, result = num1 + num2;
		System.out.println("This is num 1: " + num1);
		System.out.println("This is num 2: " + num2);
		System.out.println("This is result: " + result);
	}

	// 1st rule:- difference in no.of parameter
	static void addNumber(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("This is num 1: " + num1);
		System.out.println("This is num 2: " + num2);
		System.out.println("This is result: " + result);
	}

	// 2nd rule:- different in type of parameter
	static void addNumber(float num1, int num2) {
		float result = num1 + num2;
		System.out.println("This is num 1: " + num1);
		System.out.println("This is num 2: " + num2);
		System.out.println("This is result: " + result);
	}
	//3rd rule:- different in position of parameter 
	static void addNumber(int num1, float num2) {
		float result = num1 + num2;
		System.out.println("This is num 1: " + num1);
		System.out.println("This is num 2: " + num2);
		System.out.println("This is result: " + result);
}
    }

/*
 * METHOD OVERLOADING:- when we declare same method more than once in a class
 * with different set of parameter than that will be known as method
 * overloading.
 * 
 * 
 * Difference set of parameter:-
 * 1. diff in no.of parameter
 * 2. diff in type of parameter 
 * 3. diff in position of parameter 
 * (They never work together we can use only one condition at a time)
 * 
 * 
 * QUESTION:- Why we use method overloading?
 * As we can perform same operation in different ways.
 * 
 * QUESTION:- Can we achieve overloading by only return type?
 * Not possible, as for overloading parameter difference is mandatory.
 * 
 * IMPORTANT RULE:-  The result will depend on which returntype 
 * we are calling first and than likewise it will execute result 
 * it doesn't depend on the method type written in the class. 
 * i.e, method can be in any sequence but result will be generated in the sequence which 
 * we are calling.
 */