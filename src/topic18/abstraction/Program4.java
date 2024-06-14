package topic18.abstraction;

abstract class Shape{
	abstract void draw();        // this is default method
}
class Rectangle extends Shape{
	protected void draw() {      // we can use protected as abstract was default method
		System.out.println("Drawing rectangle");
	}
}

class Circle extends Shape{
	public void draw() {         // we can use public as abstract was default method
		System.out.println("Drawing Circle");
	}
}
public class Program4 {

	public static void main(String[] args) {
         Shape s = new Circle();
         s.draw();
         Shape s1= new Rectangle();
         s1.draw();
	}

}
