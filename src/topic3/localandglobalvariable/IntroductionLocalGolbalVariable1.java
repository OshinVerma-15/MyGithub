package topic3.localandglobalvariable;

public class IntroductionLocalGolbalVariable1 {
	
     int variable2, variable3; //global variable

	public static void main(String[] args) 
	{
		int variable1 = 90;// Local variable
		System.out.println("Variable1 value: " + variable1);
	}
}


/*
 * Local Variable:- 
 * 1. It defined inside the main method
 * 2. Life:- It doesn't have life, its life starts with main method and ends with it.
 * 3. Access:- access only inside the main method
 * 4. Memory: It does not create any memory
 * 5. it cannot be executed without initialization 
 */

/*
 * Global Variable:-
 * 1. It defined outside the main method but present inside the Class
 * 2. Life:- is when we delete that
 * 3. Access:- Can be access
 * 4. Memory:- It creates memory 
 * 5. If its not initialized during execution it takes its default value.
*/