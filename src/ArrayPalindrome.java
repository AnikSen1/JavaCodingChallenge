
public class ArrayPalindrome {

	
	public static void main(String[] args) {
		String[] array= {"Anik", "Java", "radar"};
		
		for(int i=array.length-1;i>=0;i--) {
			 String original=array[i];
			 
			 
			 StringBuilder sBuilder=new StringBuilder();
			 sBuilder.append(original);
			String oposite= sBuilder.reverse().toString();
			
			
			 if(original.equalsIgnoreCase(oposite)) {
				System.out.println(original+" is a palindrome word"); 
			 }
			 else {
				 System.out.println(original+" is not a palindrome word");  
			 }
		}
		
	}

}
