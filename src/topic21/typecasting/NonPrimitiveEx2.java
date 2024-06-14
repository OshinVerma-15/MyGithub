package topic21.typecasting;
//Downcasting
// downcasting will always be explicit
class Task01{
	   void Batting1()
{        System.out.println("Batting done by Team one");
		   }
}
 class Task2 extends Task1{
 	void Batting2() {
 		System.out.println("Batting done by Team two");
 	}
 }
 class Task03 extends Task1{
 	void Batting3() {
 		System.out.println("Batting done by team three");
 	}
 }
 public class NonPrimitiveEx2 extends Task03 {
	void Batting4() {
		System.out.println("Batting done by team four");
	}

	public static void main(String[] args) {
	 NonPrimitiveEx2 ref= new NonPrimitiveEx2();//object creation --> child class
	     Task03 ref1 = ref;	// implicit upcasting
	     ref1.Batting1();
	    // ref1.Batting2();
	     ref1.Batting3();
	    // downcasting,
	     
	     NonPrimitiveEx2 ref2 = (NonPrimitiveEx2)ref;
	     ref2.Batting3();
	    // ref2.Batting2();
	     ref2.Batting4();
	     ref2.Batting1();
	     
	   System.out.println("*********************************");
	    Task1 ref3= ref;// implicit upcasting
         ref3.Batting1();
         //downcasting
       NonPrimitiveEx2 ref4 =(NonPrimitiveEx2)ref;   
       
       System.out.println("****************************");
        Task3 ref5= new Task3();
      //  Task2 ref6= ref5;//implicit upcasting
      //  ref6.Batting2();
      //  ref6.Batting1();//implicit upcasting
        
       // Task3 ref7= (Task3)ref;
       // ref7.Batting1();
        
        
}

}
