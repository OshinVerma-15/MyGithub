package topic3.localandglobalvariable;

public class ComplexProgramLocalGlobalVariable4 {
   
	static int var1, var2;
	static float result; //Complex the program by adding another static variable
	
	public static void main(String[] args) 
	
	{
	
		//first method 
	System.out.println("value of var1 : " + var1);
	System.out.println("value of var2 : " + var2);
	
	//second method (this rule I have to follow)
	System.out.println("Standard way of writing global variable = value of var1 : " + SimpleProgramLocalGlobalVariable2.var1);
	System.out.println("Standard way of writing global variable = value of var2 : " + SimpleProgramLocalGlobalVariable2.var2);
	
	// CASE:1 (EXAMPLE)
	var1 = 20;
	var2 = 30;
	result= var1+var2;
	System.out.println("value of var1 : "+ SimpleProgramLocalGlobalVariable2.var1);
	System.out.println("value of var2 : "+ SimpleProgramLocalGlobalVariable2.var2);
	System.out.println(result);
}
    }