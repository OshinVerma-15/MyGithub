package topic17.Inheritance;

 class Juice {
	 int juice;// parent most-class 
	    Juice(){
		System.out.println("Orange juice");
		 juice = 8;
	}
	 void juice() {  
		 
		 System.out.println("Lemonade juice");
	}
}
	 class Icecream extends Juice{
		 int juice;
		Icecream(){ // constructor
			 System.out.println("Strawberry");
			 juice= 9;
		 }	 
		     void juice() {
			 System.out.println("Blackcurrent");
		 }
}

public class childExample4 extends Icecream{
                 childExample4(){
                 System.out.println("Child from Example 4");
                 System.out.println("Lemonade Value : " +super.juice);
                          }
	public static void main(String[] args) {
               childExample4 ref1 = new childExample4();
               ref1.juice();
               Juice ref2 = new Juice();
               /*System.out.println("*************************");
               Juice ref2 = new Juice();
               ref2.juice();**/
	}

}
