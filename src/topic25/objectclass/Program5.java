package topic25.objectclass;
//inheritance
  class Demo {
	  void display() {
		  System.out.println(" I am a Demo Class ");
	  }
}
public class Program5 extends Demo {
	static int a = 100;
	  void Demo1(){
		  System.out.println(" I am a Program5 Class");
	  }

	public static void main(String[] args) {
              Demo ref = new Demo();
              System.out.println("I am a toString method : "+ ref.toString());
              Demo ref1 = new Demo();
              System.out.println("I am a toString method : "+ ref1.toString());
              Demo d3 = ref1;
              System.out.println("Iam toString method of d3: "+ d3.toString());
              System.out.println("****************************************************");
              
              Program5 ref2 = new Program5();
              System.out.println("I am a string method :"+ ref2.toString());
	}
}
