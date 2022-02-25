import java.util.Scanner;

public class LeftStarTriangle {
	public static void main(String args[]){
	      
	      
	      Scanner scanner = new Scanner(System.in);
	      
	      System.out.print("Enter the number of rows : ");
	      int input = scanner.nextInt();
	      System.out.println("The left triangle star pattern : ");
	    for(int i=0; i<input; i++) {
	    	for(int j=0; j<=i; j++ ) {
	    		System.out.print("* ");
	    	}
	    	System.out.println();
	    }
	      
	}
}
	      