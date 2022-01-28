
public class ReverseNumber {

	public static void main(String[] args) {
		int number=78;
		while(number!=0) {
			int reminder=number%10;
			System.out.print(reminder);
			int removeLastDigit= number-reminder;
			number=removeLastDigit/10;	
		}
		
		
		System.out.println(" ");
		
		int number1=12340, r=0;
		while(number1!=0) {
			int reminder1=number1%10;
			r=r*10+reminder1;
			number1=number1/10;
		
		}
		System.out.print(r);
		
		
		System.out.println(" ");
		int number2=12340;
		while(number2!=0) {
			int reminder2=number2%10;
			System.out.print(reminder2);
			int removeLastDigit2= number2-reminder2;
			number2=removeLastDigit2/10;
			
		}
		
	}

}
