package topic23.array;

public class ArrayExample7 {
	
	public static void main(String[] args) {
        int[] arr= {5,-9, 8, 7, -3, 2, 11, -10, -9,-16};
   
      for(int i=0; i<arr.length;i++) {  // I will get error when i write i<=arr.length because index is 9
          System.out.println("Print numbers: "+ arr[i]);
	}
        int[] num = new int[3];
          num[0]= 20;
          num[1]= 30;
          num[2]= 40;
          ArrayExample7 b = new ArrayExample7();
          b.calling();
          ArrayExample7 c = new ArrayExample7();
          c.calling();
          ArrayExample7 d = new ArrayExample7();
          d.calling();
// above reference we have to make 3 object but below we can create only one object and call
          
          System.out.println("*****************with Array**********************");
          
          ArrayExample7[] ref = new ArrayExample7[3];
          ref[0]= new ArrayExample7();
          ref[1]= new ArrayExample7();
          ref[2]= new ArrayExample7(); 
          ref[0].calling();
          ref[1].calling();
          ref[2].calling();
       }

	  void calling() {
		
	}
          } 