
public class DuplicateCharacters {

	public static void main(String[] args) {
		
		String str= "automation";
		char[] ca=str.toCharArray();
		int count=0;
		
		for(int i=0;i<ca.length;i++) {
			
			for(int j=i+1;j<ca.length;j++) {
				
				if(ca[i]==ca[j]) {
					System.out.println("Duplicate Characters:"+ca[j]);
					count++;
				}
			}
		}
                System.out.println("Counted Duplicate Characters:"+count);
	}
	
}
