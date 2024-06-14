package topic20.overriding;

class Humans {
	{
		System.out.println("Human eats");
	}
}
 class Girl extends Humans { // default constructor
	 // override method
	 public void eats() {
		 System.out.println("Girl eats");
	 }
 }
 public class childExample4 {
	public static void main(String[] args) {
		Girl r = new Girl();
		r.eats();
	}
}