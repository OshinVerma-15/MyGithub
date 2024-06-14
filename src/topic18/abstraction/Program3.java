package topic18.abstraction;

abstract class Rubber { // 50% abs.class
	abstract void Cello();

	void Infinity() {
		System.out.println("Infinity is a rubber brand");
	}

	void Designrubber(int num) {
		System.out.println("I like different shapes of rubber : " + num);
	}
}

class Pencil extends Rubber {
	void Cello() {
		System.out.println("This a top-selling rubber brand");
	}

	void Color() {
		System.out.println("I like to have different colors of rubber");
	}

	void Designrubber(int num) {
		System.out.println("I like mango shape rubber :" + num);
		super.Designrubber(1);
	}
}

public class Program3 {

	public static void main(String[] args) {
            Pencil ref = new Pencil();
            ref.Cello();
            ref.Designrubber(9);
            ref.Color();
            System.out.println("*************************************************");
            Rubber ref1 = new Pencil();
             ref1.Cello();
             ref1.Designrubber(9);
	}

}
/*
 * DEBUGGING:- 
 * Running program step by step( line by line)
 * Add breakpoint into required step(double click on number/ click on right cursor and click on toggle button)
 * use shortcuts:-
 *       For next line- F6
 *       To go inside method- F5
 *       To get return value or variable value- Cntl+Shift+i
 *       If you are done with required execution and you want to cont. the program execution- F8
 */
