package topic23.array;
//we have to findout tha we have int 50 in our program or not?
public class ArrayExample3 {

	public static void main(String[] args) {
		int a []= {40 ,50, 10}; //given array
		 System.out.println("1st Value of int a : "+ a[0]);
		 System.out.println("2nd Value of int a : "+ a[1]);
		 System.out.println("3rd Value of int a : "+ a[2]);
		 
		 System.out.println(a.length);
		/* for(int i=0; i< a.length; i++) {
		  if(a[i]==50) {
			  System.out.println("Yes I am having 50 in my program : " + a[i]);
		  }
                  //break;
		  
                   //OR
                else {
                	System.out.println("I am not having 50 in my program: "+ a[i]);*/
		                  //OR
		  System.out.println("********for each loop************");
		  for(int num :a) {
			  System.out.println(num);
			  if( num==50) {
				  System.out.println("Yes I am having 50 in my program: "+ num);
			   }
	      }
	}
}
