package topic16.finalAndBlocks;

public class BlockProgram3 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
        BlockProgram2 b1 = new BlockProgram2();
        System.out.println("********************************");
        BlockProgram2 b2 = new BlockProgram2();
        System.out.println("Program Ends");
	}
		
		static {
			System.out.println("This is my first line");
		}
       static {
    	   System.out.println("This is my second block");
       }
       {
   		System.out.println("I am non-static block-1");
   	}
   	{  
   		System.out.println("I am non-static block-2");
   	}
   	BlockProgram3(){
   				System.out.println("I am constructor body");
   	}

	       }

