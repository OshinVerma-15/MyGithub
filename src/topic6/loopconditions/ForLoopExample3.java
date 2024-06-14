package topic6.loopconditions;

public class ForLoopExample3 {

	public static void main(String[] args) {
		
		char ch ='A';
         int num = ch;
         System.out.println("ch: "+ch);
            System.out.println("num: "+ num);   
            
            
            /*System.out.println(" *************Print number between A to Z******************");
                  
            for(char cr= 'A'; cr<= 'Z'; cr++)
            {
           System.out.println(cr); 
           
          
           
          System.out.println(" *************Print number between Z to A******************");
           
           for( char cha = 'Z';cha>= 'A'; cha--)
        	   System.out.println(cha);
           
           System.out.println(" *************Print number between a to z******************");
           for (char chc = 'a'; chc <= 'z'; chc++)
           System.out.println(chc); **/
            
          /*  System.out.println(" *************Print number between z to a******************");
                for (char ctr = 'z'; ctr>='a'; ctr--)
                	System.out.println(ctr);**/
           
           System.out.println(" *************Print vowels between A to M******************");
           for (char chc = 'A'; chc <= 'M'; chc++) {
               if (isVowel(chc)) {
                   System.out.print(chc + " ");
               }
           }
       }

       public static boolean isVowel(char chc) {
           return chc == 'A' || chc == 'E' || chc == 'I'|| chc == 'O';
       }
   }