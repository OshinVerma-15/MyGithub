package topic23.array; 
		/*
	for declaration of array 
	SYNTAX:- 
	          int a [] ;
	for initialization array:-
	SYNTAX:-
	 a = new int[]5; */

public class ArrayExample1 {

	public static void main(String[] args) {
		  System.out.println("Program Starts");
          int a[] = new int [5];  //declaration and initialization
          a[0]= 2;
          a[1]= 3;
          a[2]= 4;
          a[3]= 10;
          a[4]= 9;
          
                       //OR 
       int b[] = { 12,20,30,40,50};
       System.out.println("Sum of numbers: " + b[0]);
       System.out.println("Sum of numbers: " + b[1]);
       System.out.println("Sum of numbers: " + b[2]);
       System.out.println("Sum of numbers: " + b[3]);
       System.out.println("Sum of numbers: " + b[4]);
       
       System.out.println("****************************");
       System.out.println("********Using simple for loop*********");
       System.out.println("Length of Array :" + a.length);
       // ******whenever want to know the length of array we use arrayname.length*******
      for(int i = 0; i <a.length; i++)
      {
	System.out.println("Value of array: " + a[i]);
	
	//enhanced for-loop  or for-each loop
	//System.out.println("*************for-each loop***************");
	
	                          //OR
	  /*
	   * LHS should be same as RHS(array) type in form of class or datatype
	   * for(LHS: RHS)    --> Actual formula
	   * 
	   * for(datatype, variablename : arrayName) -->for my understanding 
	   */
	/*for(int ab : a) {
		System.out.println(ab);*/
	}
        }
	       }

//NOTE: Run 1 by 1 or else I am getting error