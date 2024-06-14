package topic21.typecasting;

    class Sample1 
  {
	 double test1 (double num) { // widening--> implicit
		  System.out.println("Running test");
		  return 3; // widening--> implicit
	  }
  }
	 public class PrimitiveP3 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Sample1 s1 = new Sample1();
		System.out.println("Value :" + s1.test1(9));
          int res= (int)s1.test1(67.89); // narrowing--> explicit
          System.out.println("return value: "+ res);
          System.out.println("Program Ends");
	}
	   }


