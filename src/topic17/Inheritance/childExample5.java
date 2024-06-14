package topic17.Inheritance;

class Country{
	int count;
	   Country(){
		   System.out.println("Dollar ");
		   count= 9;
		   
	   }
	   public void tax() {
		   System.out.println("US");
	}
}
class Currency extends Country{
	int count;
	Currency() {
		System.out.println("Rupees " );
		count = 7;
	}
	  public void tax() {
		Country r2= new Country();
		System.out.println(r2.count);
		           //or
		System.out.println("India ");
		System.out.println(count);
		System.out.println("**************************");
		System.out.println(super.count);
	}
}
        public class childExample5 {
        	
	 public static void main(String[] args) {
          Currency r1 = new Currency();
          r1.tax();
	 }

}
