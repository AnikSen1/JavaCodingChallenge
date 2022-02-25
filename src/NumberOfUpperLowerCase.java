import java.util.Scanner;

public class NumberOfUpperLowerCase {

	public static void main(String[] args) {
	
		System.out.println("Enter the Sentence: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		int uperCaseCount=0,lowerCaseCount=0;
		char[] ch=str.toCharArray();
		for(char cha:ch) {
			
			if(cha>='A' && cha<='Z') {
				
				uperCaseCount++;
			}
			else if(cha>='a' && cha<='z') {
				
				lowerCaseCount++;
			}
			else {
				continue;
			}
		}
		System.out.println("Number of Upper case character: "+ uperCaseCount);
		System.out.println("Number of Lower case character: "+ lowerCaseCount);	
	}

}
