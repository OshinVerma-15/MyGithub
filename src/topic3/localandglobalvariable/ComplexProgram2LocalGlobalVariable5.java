package topic3.localandglobalvariable;

public class ComplexProgram2LocalGlobalVariable5 {
	static double result;

	public static void main(String[] args) {
		int var1 = 20;
		int var2 = 30;
		result= var1+var2;
		System.out.println("value of var1 : "+ SimpleProgramLocalGlobalVariable2.var1);
		System.out.println("value of var2 : "+ SimpleProgramLocalGlobalVariable2.var2);
		System.out.println(result);
	
	}

}
/*
 * STATIC GLOBAL VARIABLE: Variable should always be start from word "static"
 * 1. Memory allocation during compilation of .class file
 * 2. Because of memory allocation we can say it as : Class Member
 * 
 *                        SYNTAX: classname.staticglobalvariablename
 **/

