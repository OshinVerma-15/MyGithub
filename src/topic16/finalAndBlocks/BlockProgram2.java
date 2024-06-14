package topic16.finalAndBlocks;

public class BlockProgram2 {

	public static void main(String[] args) {
              System.out.println(" Program Starts");
              BlockProgram2 b1 = new BlockProgram2();
              System.out.println("********************************");
              BlockProgram2 b2 = new BlockProgram2();
              System.out.println(" Program Ends");
	}
	{
		System.out.println("I am non-static block-1");
	}
	{  
		System.out.println("I am non-static block-2");
	}
	BlockProgram2(){
				System.out.println("I am constructor body");
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
