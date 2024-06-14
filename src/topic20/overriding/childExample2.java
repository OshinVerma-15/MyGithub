package topic20.overriding;

 class Tree {
	 public void Mango(){
		 System.out.println("Tree : 1");
	 }
	 void tree() {
		 System.out.println("Tree : 2");
	 }
 }
 class Fruit extends Tree {
	 public void Mango() {
		// super.Mango();  // this statement further this method to parent program or else program execute only child class
		 System.out.println("Tree : 3");
	 }
	 void tree() {
		 System.out.println("Tree : 4");
	 }
 }

public class childExample2 {

	public static void main(String[] args) {
               Tree f1 = new Fruit();
                f1.Mango();
	}

}
