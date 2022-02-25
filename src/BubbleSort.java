import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
        
        int[] array= {5,2,3,9,3};
        System.out.println("Before sorting: "+ Arrays.toString(array));
        for(int i=0; i<=array.length-2; i++) {
        	
        	for(int j=0; j<=array.length-2; j++) {
        		
        		if(array[j]>array[j+1]) {
        			int temp=array[j];
        			array[j]=array[j+1];
        			array[j+1]=temp;
        		}
        	}
        }   
        System.out.println("After sorting: "+ Arrays.toString(array));  
	}
}
