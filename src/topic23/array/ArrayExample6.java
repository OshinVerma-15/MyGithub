package topic23.array;
class Array1{
static int[] array() {
		
		return new int[] {9,6,7,2,10};
	}
}
public class ArrayExample6 {
	
	public static void main(String[] args) {
         int arr[]= Array1.array();
         System.out.println("Array length: " + arr.length);
         for(int i = 0; i< arr.length; i++) {
         System.out.println("Array sequence : "+ arr[i]);
         }
	}
}
