
public class IntegerPalindrome {

	public static void main(String[] args) {
		int original=12340, 
				rev=0;
		while(original!=0) {
			rev=rev*10+original%10;
			original=original/10;
		}
		System.out.println(rev);	
		
		if(original==rev) {
			System.out.println("Your given number is a palindrome");
		}
		else
		{
			System.out.println("Your given number is not a palindrome");
		
		}

	}

}
