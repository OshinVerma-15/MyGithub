package topic28.stringclass;

public class Program3 {

	public static void main(String[] args) {
		String s1= "Pune";// one object created in 1.SCP
		String s2= new String("Pune");// one object created in 1.NSCP
		
		System.out.println("String s1 & s2 comparison on equals value : "+ s1.equals(s2));// true
        System.out.println("Checking string value on address value : " + (s1==s2)); //false
	}
}
