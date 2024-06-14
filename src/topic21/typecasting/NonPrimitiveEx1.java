package topic21.typecasting;
//Upcasting--> explicit and implicit

   class Task{
	   void Batting1()
{        System.out.println("Batting done by Team one");
		   }
   }
    class Task1 extends Task{
    	void Batting2() {
    		System.out.println("Batting done by Team two");
    	}
    }
    class Task3 extends Task1{
    	void Batting3() {
    		System.out.println("Batting done by team three");
    	}
    }

public class NonPrimitiveEx1 extends Task3 {
	void Batting4() {
		System.out.println("Batting done by team four");
	}
	public static void main(String[] args) {
		NonPrimitiveEx1 r = new NonPrimitiveEx1();
		r.Batting4();
		r.Batting2();
	    Task3 r1 = (Task3)new NonPrimitiveEx1();// explicit upcasting
	    r1.Batting3();
	    Task1 r2= new NonPrimitiveEx1(); // implicit upcasting
	     r2.Batting1();
	    Task1 r3 = new Task3();// implicit upcasting
	     r3.Batting2();
	     System.out.println("*************************");
	     Task r4 = (Task)new Task1();//explicit upcasting
	     r4.Batting1();
	     
	     System.out.println("*************************");
	     Task1 obj = r1;
	     r1.Batting3();
	     
	    
	}

}
