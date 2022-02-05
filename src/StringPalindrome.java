import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		String original, reverse="";
		Scanner input=new Scanner(System.in);
		original=input.nextLine();
		int length=original.length();
		
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
		}
		if(original.equalsIgnoreCase(reverse)) {
			System.out.println("Your given string is a palindrome");
		}
		else
		{
			System.out.println("Your given string is not a palindrome");
		
		}
		
		
	}

}
