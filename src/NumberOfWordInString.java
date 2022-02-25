import java.util.Scanner;

public class NumberOfWordInString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String sentence=sc.nextLine();
		
		int numberOfWord=sentence.split(" ").length;
		
		if(sentence=="") {
			numberOfWord=0;
		}
		System.out.println("Number Of Word in this sentence: "+numberOfWord);

	}

}
