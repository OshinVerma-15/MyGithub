package topic22.polymorphism;

public class StaticPolyEx1 { //EarlyBinding, Compiletime polymorphism
	
	static void Class(int a, int b){
		int c =a+b;
		System.out.println("Addition of two numbers");
	}
	static void Class(int a, int b , int c) {
		int d= a+b+c;
		System.out.println("Addition of three numbers: " + d);
	}
	public static void main(String[] args) {
		StaticPolyEx1.Class(89,90,67);
	}
}
/*When a method gets to know its implemetation during the compilation time is called static polymorphism 
 * and it is done by static members overloading*/
 