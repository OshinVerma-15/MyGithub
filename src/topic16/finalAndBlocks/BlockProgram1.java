package topic16.finalAndBlocks;

public class BlockProgram1 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("Program Ends");
	}
		
		static {
			System.out.println("This is my first line");
		}
       static {
    	   System.out.println("This is my second block");
       }
	}

/* Block:- they don't have name, returntype, return value and 
           we cannot call them based on our requirements
    curly {} :- body, block, main
    static block -
                       * static {
                                  // static block or SIB
                                                 }
                   * non-static block:- {
                                 // non-static block or NSIB
                                              }
    
  SIB(Static initialization block):- 
               * It is use to provide important information before we get into the actual login  
                 and it will be automatically executed before main()
               * A class can have multiple SIB's  in this case all SIB's will be executed sequentially.
 NSIC(Non-Static initialization block) :- 
               * It is use to provide important information before initializing any object
               * A class can have multiple NSIB's in this case all NSIB's will be executed before constructor sequentially.
    **/

