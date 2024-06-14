package topic15.thisconstructor;

public class Program3 {
	// static and non- static global variable
	static int age = 90;
	
         {
		// TODO Auto-generated constructor stub
	}
	static void start() 
	{
		 System.out.println("Global age: "+ Program3.age);
	}
       void calling() 
       {
    	  System.out.println("Global age NSGV " );
       }
       
	public static void main(String[] args) {
		 
		System.out.println("Global age: "+ Program3.age);
		Program3 ref= new Program3();
 	    ref.calling();
		System.out.println("Global age access from NSGV: " + ref.age);
		
		
		
	}

}
