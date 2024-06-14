package topic26.systemclass;

public class Program2 {

	public static void main(String[] args) {
		
		//for current user directory -----> 1st way
		String userHome= System.getProperty("user.home");
        System.out.println("User directory name: "+ userHome);
        
        //current working directory  ------> 2nd way
        System.out.println("Current user property: "+ System.getProperty("user.home"));
        System.out.println("Current working directory: "+ System.getProperty("user.dir"));
        
        //for country
        System.clearProperty("user.country");
        System.out.println("Get country value after clearance: "+ System.clearProperty("user.country"));
        System.setProperty("user.country", "India");
        System.out.println("For user country location :"+System.getProperty("user.country"));
        
        //for operating system
        System.out.println("For java version : "+System.getProperty("os.version"));
        System.out.println("For OS name: "+ System.getProperty("os.name"));
        System.out.println("For Java name: "+ System.getProperty("java.home"));
        
        //for time
        System.out.println("For time :"+ System.currentTimeMillis());
        
        //We cannot check the user password either it will error or null value
        System.out.println("For Java name: "+ System.getProperty("user.password"));
	}
}

/*interview Question:- What we cannot achieve/get information from System.getProperty...?
            Answer :- Password, either it will give null value or error message*/

/* to Set property value :- System.getProperty;
   to Clear value        :- System.clearProperty;
   to get value          :- System.getProperty; */