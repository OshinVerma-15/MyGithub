package topic28.stringclass;
//string object with literals

public class Program1 {

	public static void main(String[] args) {
              String s1 = "Delhi"; 
              System.out.println("String s1 : "+ s1);  //static constant pool
              System.out.println("Character count in String s1 : "+ s1.length());// because string stores an array
              
              String s2= "Bhilai"; 
              System.out.println("String s2 : "+ s2);//static constant pool
              System.out.println("Character count in String s2 : "+ s2.length());// because string stores an array
              
              System.out.println("String s1 & s2 comparison on equals value : "+ s1.equals(s2));//checks s1 value is same as s2 or not?
              System.out.println("Checking string value on address value : " + (s1==s2));
              
              String s3 = "Bhilai"; // will be same as this object is not unique
              System.out.println("String 3 :"+ s3);
              System.out.println("String s1 & s2 comparison on equals value : "+ s2.equals(s3));
              System.out.println("Checking string value on address value : " + (s3==s2));
	}
}
