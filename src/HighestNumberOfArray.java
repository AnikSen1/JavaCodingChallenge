
public class HighestNumberOfArray {

	public static void main(String[] args) {
		
		int[] numbers= {10,4,0,99,8,36788};
		int largestValue=numbers[0];
		
		for(int i=1;numbers.length-1>=i;i++) {
			int newValue=numbers[i];
			if(newValue>largestValue) {
				largestValue=newValue;
			}
		}
		System.out.println("Highest Number:"+largestValue);
		
		
		
		int smallestValue=numbers[0];
		for(int i=0;numbers.length>i;i++) {
			int newValue=numbers[i];
			if(newValue<smallestValue) {
				smallestValue=newValue;
			}
		}
		System.out.println("Lowest Number:"+smallestValue);
		
	
		//Using ternary operator (without if condition)
		int[] a= {4,7,8,1,47,4};
		int largest=a[0];
		
		for(int i=0;i<a.length;i++) {
		  largest=largest>a[i]?largest:a[i];
		}
		System.out.println("Highest Number: "+largest);
	
	}

}
