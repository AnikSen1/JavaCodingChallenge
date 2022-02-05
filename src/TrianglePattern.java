import java.util.Scanner;

public class TrianglePattern {

	public static void main(String[] args) {
		int input; 
		Scanner in= new Scanner(System.in);
		input=in.nextInt();
		for(int i=1;i<=input;i++) {
			
			for(int j=input;j>i; j--) {
				System.out.print(" ");  //give space
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");  //Print incremental number
			}
			System.out.println("");  //create new line
		}
	}

}
