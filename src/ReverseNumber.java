
public class ReverseNumber {

	public static void main(String[] args) {
		int number=78;
		while(number!=0) {
			int reminder=number%10;
			System.out.print(reminder);
			number=number/10;	
		}
		
		
		System.out.println(" ");
		
		int numberI=12340, 
				rev=0;
		while(numberI!=0) {
			rev=rev*10+numberI%10;
			numberI=numberI/10;
		}
		System.out.println(rev);	
		
		
		int num=345;
		StringBuffer sBuffer=new StringBuffer(String.valueOf(num));
		sBuffer.reverse();
		System.out.println(sBuffer);
		//StringBuffer reverse=sBuffer.reverse();
		//System.out.println(reverse);
		
		
		
		StringBuilder sBuilder=new StringBuilder();
		sBuilder.append(String.valueOf(num));
		sBuilder.reverse();
		System.out.println(sBuilder);
		//StringBuilder reverse=sBuilder.reverse();
		//System.out.println(reverse);
				
	}

}
