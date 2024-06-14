package topic12.method;

//Print characters between "A to M"
public class Assignment4 {

	public static void main(String[] args) {
		
		Assignment4.alphabetOrder('A','M');
	}
		
		static void alphabetOrder(char starts, char ends) {
			for(; starts<=ends; starts++)
			{
				System.out.print( starts + " ");
			}
	}

}
