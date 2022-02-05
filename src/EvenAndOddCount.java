
public class EvenAndOddCount {

	public static void main(String[] args) {
		int number=678903150, even=0, odd=0;
		
		while(number!=0) {
		int	reminder=number%10;
		if(reminder%2==0) {
			even++;
		}
		else
		{
			odd++;
		}
		number=number/10;
		}
		System.out.println("Even Number:"+even);
		System.out.println("Odd Number:"+odd);
	}

}
