package topic26.systemclass;
 class Demo {
	 void display() { //non-static method
		 System.out.println(" I am a display method ");
	 }
 }
public class Program1 {
              // static reference variable 
              static int salary = 90000; // for understanding global variable
              static Demo ref1 = new Demo(); //--> static reference variable
	public static void main(String[] args) {
              Demo ref= new Demo(); // non-static reference variable
              ref.display(); //accessing non-static members
              
              //accessing static member
              Program1.calling();
              calling();
              System.out.println(Program1.salary);
              
              Program1.ref1.display(); //imp line
              //ClassName.staticReferenceVariableofDemoClass.Non-staticmemeberofDemoClass
              
              System.out.println();
              //ClassName.staticReferncevariableofPrintStreamClass.Non-staticmemberofPrintStreamClass
                
              System.err.println("This gives standard error message");
              System.out.println("This gives standard output message");
              
	}
	static void calling() {  //static method
		System.out.println(" I am a calling method ");
	}
}
