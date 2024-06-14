package topic23.array;
   class Example1 {
	static void min(int arr[]) {//5, 9,15,4,16, 19,23  // returntype = int[] = int array
		int min= arr [0];
		for(int i=1; i< arr.length; i++) {
			  if (min > arr[i]){
				  min = arr[i];
			  }
		}
			  System.out.println("Minimum value of array: "+ min);
		}
	        static void max(int arr[]) {//5, 9,15,4,16, 19,23
		     int max= arr [0];
		     for(int i=1; i< arr.length; i++) {
			  if (max < arr[i]){
				  max = arr[i];
          }
		}
			  System.out.println("Minimum value of array: "+ max);
	  }
   }
	  
      public class ArrayExample5{
	   public static void main(String[] args) {
       int a []= {5, 9,15,4,16, 19,23};
       Example1.min(a);	
       Example1.max(a);
	     }
	   }
