package topic20.overriding;

class Human {
	{
		System.out.println("Human eats");
	}
}
 class Boy extends Human { // default constructor
	 // override method
	 //public void eat()
	 protected void eat()
	 {
		 System.out.println("Boy eats");
	 }
 }
public class childExample3 {
	public static void main(String[] args) {
		Boy r = new Boy();
		r.eat();
	}

}

/* Members not participate it in overriding :- 
 * static method
 * final method
 * private method
 * constructor
 */


/* OVERRIDE:- When we declare a method in child class which is already present in parent class
 *  In overriding we can increase the visibility of overridden method --> public > private > default > protected
 *  default --> protected or public
 *  protected--> protected or public
 *  public--> public
 */