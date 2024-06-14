package topic4.operators;

public class UnaryOps {

	public static void main(String[] args) {
		
		int x= 10;
		int y = x   +  x++  +   ++x   +x;
		
	        x= 12;
			y= 44;
			System.out.println(x);
			System.out.println(y);
			
			
			//Case2
				
			int a= 0,b;
			b= a++  +  ++a  + ++a  +a;
			System.out.println(a);
			System.out.println(b);
			
			
			//Case3
			
		  int c = 0;
			int d= a--  +  --a +  --a  +a;
			System.out.println(c);
			System.out.println(d);
			
	}

}
