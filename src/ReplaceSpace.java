import java.util.Scanner;

public class ReplaceSpace {

	public static void main(String[] args) {
		String str;
		Scanner in= new Scanner(System.in);
		
		str=in.nextLine();
		//String newString=str.replaceAll(" ", "");
		String newString=str.replaceAll("\s", "");
		System.out.println(newString);

	}

}
