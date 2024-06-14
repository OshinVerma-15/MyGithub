package topic22.polymorphism;
// dynamic method overloading
  class Flower{
	  void Flower() {
		  System.out.println("Different types of flowers" );
	  }
	  void Redrose() {
		  System.out.println("Roses are red");
	  }
  }
	   class Fragrance extends Flower{
		  void Flower() {
			  System.out.println("All flowers doesnt have fragrance");
		  }
		  void Redrose() {
			  System.out.println("Rose has fragrance");
		  }
	  }
public class DynamicPolyEx2 {

	public static void main(String[] args) { // inheritance, overriding, upcasting
		Fragrance ref1 = new Fragrance(); // Homogeneous
		ref1.Flower();
		ref1.Redrose();
		Flower ref = new Fragrance();// polymorphism - inheritance, override, upcasting
		ref.Flower();
		ref.Redrose();
	}

}
