package topic28.stringclass;
//object based on new class

public class Program2 {

	public static void main(String[] args) {
		String s1=  new String("Pune");// 2 object will be created in 1.SCP , 2.NSCP
		String s2=  new String("Bhilai");// 2 object will be created in 1.SCP , 2.NSCP
		String s3=  new String("Pune"); // 1 object will be created in NSCP
		System.out.println("s1 : "+ s1);
		System.out.println("s2 : "+ s2);
		System.out.println("s3 : "+ s3);
        
        System.out.println("String s1 & s2 comparison on equals value : "+ s1.equals(s2));//checks s1 value is same as s2 or not? //false
        System.out.println("Checking string value on address value : " + (s1==s2)); //false
        
        System.out.println("String s1 & s2 comparison on equals value : "+ s1.equals(s3)); //true
        System.out.println("Checking string value on address value : " + (s1==s3)); //false
}
	}

// equals denote to = Static Constant Pool
// address denotes to = Non- Static Constant Pool