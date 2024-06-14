package topic23.array;

public class ArrayExample2 {

	public static void main(String[] args) {
		char a[]= new char[] {'A', 'F','P', 'O'}; // If we want to put size number than we can use this method--> {} we put the value in this {}
         System.out.println("Program Starts");
         System.out.println("Length of characters: " + a.length);
         System.out.println("***********************************");
         
                    //OR
        char ch[] = new char [4];
        ch[0] = 'A';
        ch[1] = 'B';
        ch[2] = 'C';
        ch[3] = 'D';
        System.out.println("Value of 1st Char : "+ ch[0]);
        System.out.println("Value of 2nd Char : "+ ch[1]);
        System.out.println("Value of 3rd Char : "+ ch[2]);
        System.out.println("Value of 4th Char : "+ ch[3]);
        
                      //OR
        System.out.println("*********************************");
        char chac[] = {'A', 'B','C', 'D'};
        System.out.println("Value of 1st Char : "+ chac[0]);
        System.out.println("Value of 2nd Char : "+ chac[1]);
        System.out.println("Value of 3rd Char : "+ chac[2]);
        System.out.println("Value of 4th Char : "+ chac[3]);
        
                       //OR
        
        System.out.println("***************FOR LOOP******************");  
        for(int i = 0; i< chac.length; i++) {
        	System.out.println(chac[i]); 
        	
        	          //OR
      /*  System.out.println("***************FOR-EACH LOOP******************");	
        for(char chc: ch) {
        	System.out.println(chc);*/
        	
        }
           }
              }
 // NOTE: Run 1 by 1 or else I am getting error
