import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		
		System.out.println("Please, give a Alphabet input");
		Scanner sc=new Scanner(System.in);
		char input=sc.next().charAt(0);
		
		if('a'<=input && input<='z'||'A'<=input && input<='Z') {
		if(input==('a')||input==('e')||input==('i')||input==('o')||input==('u')||input==('A')||input==('E')||input==('I')||input==('O')||input==('U')) {
			System.out.println(input+" is a Vowel");
		}
		else {
			
			System.out.println(input+" is a Consonant");
		}
		}
		else {
			System.out.println("Please, give a Alphabet input");
		}
	}

}
