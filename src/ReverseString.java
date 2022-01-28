
public class ReverseString {

	public static void main(String[] args) {
		
		//Without using reverse method
		String word="JAVA";
		char[] ca=word.toCharArray();
		for(int i=ca.length-1; i>=0; i--) {
			System.out.print(ca[i]);
		}
		
		
		System.out.println(" ");
		String word1="MAVEN";
		StringBuilder sBuilder= new StringBuilder();
		sBuilder.append(word1);
		sBuilder.reverse();
		System.out.println(sBuilder);
		
		
		System.out.println(" ");
		String word2="GIT";
		StringBuffer sBuffer= new StringBuffer(word2);
		sBuffer.reverse();
		System.out.println(sBuffer);
		
	}
	
	
	}


