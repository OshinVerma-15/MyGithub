package topic25.objectclass;

public class Program4 {
	public String toString(){  //overriding
		  return "Pune";	  
	}
      public int hashCode() {  //overriding
    	  return 400;
      }
	public static void main(String[] args) {
		      Program4 refr = new Program4();
           System.out.println("I am toString method: "+ refr.toString());  
           System.out.println("I am hashcode value: "+ refr.hashCode());
           
           System.out.println("**************************************");
           Program4 ref = new Program4();
           System.out.println("Iam toString method :"+ ref.toString());
           System.out.println("Iam equals value: "+ ref.equals(refr));
           
           System.out.println("**************************************");
           Program4 re= ref;
           System.out.println("Iam equals program: "+ re.equals(ref));
           
	}
}
