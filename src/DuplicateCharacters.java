
public class DuplicateCharacters {

	/*public static void main(String[] args) {
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
	}*/
	
	
	public static void main(String[] args) {
		String w="automation";
		char[] ch=w.toCharArray();
		int count=0;
		
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Duplicate character: "+ch[i]);
					count++;
				}
			}
		}
		System.out.println("Counted Duplicate Characters:"+count);
	}
	
}
