package topic22.polymorphism;

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
	    	 System.out.println(" Money from Bank 1 :"+ super.amount);
	     }
 }

public class DynamicPolyEx3 extends Branch1{
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
	    	 System.out.println(" Money from Bank 1 :"+ super.amount);
	     }

	public static void main(String[] args) {
		Branch1 ref= new Branch();// this line imp - ref
		System.out.println("Reference of parent"); 
		ref= new DynamicPolyEx3();// this line imp - ref
		System.out.println("DynamicPolyEx3 STATEMENT");
	}
}
  // in hirechery when there is only one parent for different child we can put ref. name for all the subclasses