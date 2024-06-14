package topic27.scannerclass;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
          boolean bool;
          float fl;
          char ch;
          Scanner sc = new Scanner(System.in);
          System.out.println("Please enter boolean value : ");
          bool = sc.nextBoolean();
          System.out.println("This is boolean value: "+ bool);
          
          System.out.println("Please enter you float value :");
          fl = sc.nextFloat();
          System.out.println("Float value "+ fl);
          
          System.out.println("Please enter char value :");
          ch = sc.next().charAt(0);
          System.out.println("This is char value: "+ ch);
          
           
	}

}
