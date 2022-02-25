
public class SeparatingWord {

	public static void main(String[] args) {
		String word="Anik";
		Object afterSplit=word.charAt(0);
		
		for(int i=1; i<=word.length()-1; i++) {
			
				afterSplit=afterSplit+" "+word.charAt(i);	
		
		}
		System.out.println(afterSplit);
	
	}

}
