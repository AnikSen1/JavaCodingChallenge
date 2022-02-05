
public class HighestNumberOfArray {

	public static void main(String[] args) {
		int[] numbers= {10,4,36788,0,99,8};
		int value=numbers[0];
		for(int i=0;numbers.length>i;i++) {
			int newValue=numbers[i];
			if(newValue>value) {
				value=newValue;
			}
		}
		System.out.println("Highest Number:"+value);
		
		
		
	
		for(int i=0;numbers.length>i;i++) {
			int newValue=numbers[i];
			if(newValue<value) {
				value=newValue;
			}
		}
		System.out.println("Lowest Number:"+value);
		
	
		//Using ternary operator (without if condition)
		int[] a= {4,7,8,1,47,4};
		int largest=a[0];
		
		for(int i=0;i<a.length;i++) {
		  largest=largest>a[i]?largest:a[i];
		}
		System.out.println("Highest Number: "+largest);
	
	}

}
