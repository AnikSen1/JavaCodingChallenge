import java.util.HashMap;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		String paragraph;
		
		Scanner in=new Scanner(System.in);
		paragraph=in.nextLine();
		
		String[] splitOnSpace=paragraph.split(" ");
		HashMap<String,Integer> map=new HashMap();
		
		for(int i=0;i<splitOnSpace.length;i++) {
			
			if(map.containsKey(splitOnSpace[i])) {
				int count=map.get(splitOnSpace[i]);
				map.put(splitOnSpace[i], count+1);
			}
			else
			{
				map.put(splitOnSpace[i], 1);
			}
		}
		System.out.println(map);
	}

}
