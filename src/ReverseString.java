
public class ReverseString {

	public static void main(String[] args) {
		
		String word="Anik", reverse="";  //Without using reverse method
		
		for(int i=word.length()-1; i>=0; i--) {
			reverse=reverse+word.charAt(i);
		}
		System.out.println(reverse);
		
		
		
		String wordI="JAVA";           //By Converting to Array
		char[] ca=wordI.toCharArray();
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


