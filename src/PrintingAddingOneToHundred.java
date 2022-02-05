
public class PrintingAddingOneToHundred {

	public static void main(String[] args) {
		int n=1;
		while(1<=n && n<=10) {
			System.out.print(" "+n);
			n=n+1;
		}
		
		System.out.println("  ");
		int num=1, sum=1;
		while(1<=num && num<100) {
			num=num+1;  //2,3
			sum=sum+num; //1+2, 3+3
		}
		System.out.println("Summation of 1 to 100: "+sum);
		
		
		
		
		

	}

}
