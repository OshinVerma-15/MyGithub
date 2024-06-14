package topic17.Inheritance;

    class Perfume extends childExample3{
	void Mild (){
		 System.out.println("Mild perfume brand is Nivea");
	}
	void Strong() {
		System.out.println("Hard perfume brand is Axe");
	}
     }
	
	class Powder extends Perfume {
		Powder (){
			super();
		}
		void Cream () {
			System.out.println("Mild face powder brand is Jhonsons");
		}
		void Base () {
			System.out.println("Strong face powder brand is Ponds ");
}
	}
   public class childExample3 {
	   //blank no body - this means it will be blank

	public static void main(String[] args) {
		     childExample3 r1 = new childExample3();
		     // no output as this class in empty
		     
		    Perfume p1 = new Perfume();
		     p1.Mild();
             p1.Strong();
		     Powder p2= new Powder();
		     p2.Mild();
		     p2.Strong();
   }
}
/* Multilevel inheritance :- Powder - submost child
                             Perfume
                             childExmaple3 - parent
                             **/ 