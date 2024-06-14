package topic20.overriding;

class Branch1{
	 int amount;
	 void Branch(){
		 System.out.println(" Branch name : Bhilai ");
		 amount =14000;
	 }
	  void Bank2() {
		 System.out.println(" Bank name1 : ICICI ");
	 }
	  void Bank3() {
		 System.out.println(" Bank name2 : BOI ");
	 }
}
  class Branch extends Branch1 {
	   int amount;
	   void Branch(){
		   super.Branch();
		   System.out.println(" Branch Name : Nehru Nagar ");
		   amount = 25000;
	   }
	    void Bank2(){
	    	super.Bank2();
		   System.out.println(" Bank Name1 : SBI ");
	   }
	     void Bank3() {
	    	System.out.println(" Bank Name2 : Canara Bank ");  
	    	//System.out.println(" Money present in Bank 2 :" + amount);
	    	// System.out.println(" Money from Bank 1 :"+ super.amount);
	    }
  }
public class childExample1 {

	public static void main(String[] args) {
		Branch b = new Branch();
        b.Branch();
   	System.out.println("*******************************");
   	/*b.Bank2();
   	System.out.println("*******************************");
   	b.Bank3();
   	System.out.println("*******************************"); **/
   	                         //OR 
		Branch1 b1 = new Branch();
		b1.Branch();
		System.out.println("*******************************");
		b1.Bank2();
		System.out.println("*******************************");
		b1.Bank3(); //this will not give parent result Bank3 because super statement is not used in line 27
		}
}
