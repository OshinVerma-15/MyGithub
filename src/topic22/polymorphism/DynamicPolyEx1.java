package topic22.polymorphism;

class Car {
	 int car= 30000;
	 void Car() {
		System.out.println("Minimal range Car: " );
	}
 }
	class Toyota extends Car{
		int car = 890000;
		}
   public class DynamicPolyEx1 {
	public static void main(String[] args) {
        //  Toyota ref= new Toyota();
          Car ref1= new Toyota();// inheritance, upcasting, override
          ref1.Car();
          System.out.println (ref1.car);  
	}
}
//30000 will come because variable cannot be override and variable we put reference comes from that method only