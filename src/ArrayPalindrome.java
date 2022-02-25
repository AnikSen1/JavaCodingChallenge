
public class ArrayPalindrome {

	
	public static void main(String[] args) {
		String[] array= {"Anik", "Java", "radar"};
		
		for(int i=0; i<=array.length-1; i++) {
			  String original=array[i];
			 
			 
			 StringBuilder sBuilder=new StringBuilder();
			 StringBuilder obj=sBuilder.append(original);
			String oposite= obj.reverse().toString();
			
			
			 if(original.equalsIgnoreCase(oposite)) {
				System.out.println(original+" is a palindrome word"); 
			 }
			 else {
				 System.out.println(original+" is not a palindrome word");  
			 }
		}
		
	}

}
