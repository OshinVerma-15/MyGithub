package topic17.Inheritance;
  class fruit //parent
  {     
	   void grapes() {
		   System.out.println("Fruit 2");
	}
	  void guvava() {
		  System.out.println("Fruit 1");
	  }
  }
  
  class chocolate extends fruit {  //chocolate-child
	   //by default present because of java compiler
	  void milk(){
		  System.out.println("Dairymilk");
	  }
	  void choco() {
		  System.out.println("Kitkat");
	  }
  }

      public class childExample2 extends fruit{ //childexample2 -child
	   void butter() {
		   System.out.println("Amul Butter");
	   }

	public static void main(String[] args) {
		 System.out.println("Listing of my favourite items: ");
		 
		chocolate c1= new  chocolate();
		fruit f1= new fruit();
		childExample2 c2 = new childExample2();
		       
	}

}
      // Hirecherchial-    Fruit -
     //           chocolate    childExample2
