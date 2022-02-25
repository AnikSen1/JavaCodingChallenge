import java.util.Scanner;

public class PrimeAndComposite {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int count=0;
		for(int i=2; i<number; i++) {
			if(number%i==0) {
				count++;
				break;
			}
			
		}
		if(count==0) {
			System.out.println(number+" is a Prime number");
		}
		else {
			System.out.println(number+" is a Composite number");
		}
	}

}
