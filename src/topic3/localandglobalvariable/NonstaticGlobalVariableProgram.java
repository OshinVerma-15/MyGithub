package topic3.localandglobalvariable;

public class NonstaticGlobalVariableProgram {
         int var1, var2; 
         
	public static void main(String[] args) {

		// NonstaticGlobalVariableProgram ref;  [declaration]
		// ref = new NonstaticGlobalVariableProgram();  [initialization]
	
		NonstaticGlobalVariableProgram ref=new NonstaticGlobalVariableProgram();
	
		System.out.println("Nonstatic program var1: " + ref.var1);
		System.out.println("Nonstatic variable name: " + ref.var2);
		
		ref.var1 = 25;
		ref.var2= 35; 
		System.out.println("value of new var1: " + ref.var1);
		System.out.println("value of new var2: " +ref.var2);
		
	}
	  
}
