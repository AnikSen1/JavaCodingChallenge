
public class IntegerPalindrome {

	public static void main(String[] args) {
		int numberI=12340, 
				rev=0;
		while(numberI!=0) {
			rev=rev*10+numberI%10;
			numberI=numberI/10;
		}
		System.out.println(rev);	
		
		if(numberI==rev) {
			System.out.println("Your given number is a palindrome");
		}
		else
		{
			System.out.println("Your given number is not a palindrome");
		
		}

	}

}
