import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		
		String original, reverse="";
		
		Scanner input=new Scanner(System.in);
		original=input.nextLine();
		
		for(int i=original.length()-1; i>=0; i--) {
			reverse=reverse+original.charAt(i);
		}
		System.out.println(reverse);
		
		if(original.equalsIgnoreCase(reverse)) {
			System.out.println("Your given string is a palindrome");
		}
		else
		{
			System.out.println("Your given string is not a palindrome");
		
		}
		
		
	}

}
