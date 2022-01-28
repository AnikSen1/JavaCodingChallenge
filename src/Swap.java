import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int a=5, b=10;
		System.out.println("a:"+a+" b:"+b);

		int temp=a;
		a=b;
		b=temp; 
		System.out.println("After swap:"+" a: "+a+" b:"+b);
		//OR
		a=a-b;
		b=a+b;
		a=b-a;
		
		System.out.println("After swap: "+" a:"+a+" b:"+b);
		
		//Without giving input, using Scanner class
		Scanner input=new Scanner(System.in);
		int m=input.nextInt();
		int n=input.nextInt();
		
		/*
		int temp1=m;
		m=n;
		n=temp1;
		*/
		
		m=m-n;
		n=m+n;
		m=n-m;
		
		System.out.println("After swap: "+" m:"+m+" n:"+n);
		
		
		
		
		
		
	}
	

}
