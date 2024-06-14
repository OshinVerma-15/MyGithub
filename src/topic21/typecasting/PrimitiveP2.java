package topic21.typecasting;

public class PrimitiveP2 {
	 void calling(double num) {
		 System.out.println("double value: "+ num); 
	 }
     
	 /* void calling(int num) {
		 System.out.println("int value: "+ num);*/
	
	public static void main(String[] args) {
		PrimitiveP2 p = new PrimitiveP2();
		 p.calling(3);

	}

}
// when result will come in double it is widening --> implicit
