import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {


		int p=0, q=1, nextNumber;

		System.out.print(p+" "+q); // without ln

		for(int i=1;i<=10;i++) {
			nextNumber=p+q;
			System.out.print(" "+nextNumber); // without ln
			p=q;
			q=nextNumber;
		}


		System.out.println();	


		System.out.println("For getting n numbers of fibonacci numbers give input n-2");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=0, b=1, nextNum;

		System.out.print(a+" "+b); // without ln

		for(int i=1;i<=n;i++) {
			nextNum=a+b;
			System.out.print(" "+nextNum); // without ln
			a=b;
			b=nextNum;
		}
	}
}
