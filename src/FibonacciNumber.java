
public class FibonacciNumber {

	public static void main(String[] args) {
		
		
		int a=0, b=1, nextNumber;
		 
		System.out.print(a+" "+b); // without ln
		
		for(int i=1;i<=10;i++) {
		nextNumber=a+b;
		System.out.print(" "+nextNumber); // without ln
		a=b;
		b=nextNumber;
		}
		
	}

}
