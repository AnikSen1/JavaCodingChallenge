import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
	String[] array= {"coconut","ant","mango","Apple","Orenge"};
	Arrays.sort(array);
	for(String newArray:array) {//All upper case will sort first then all lower case
		System.out.println(newArray);
	}
	System.out.println("<<<<<<<<<<>>>>>>>>>>>");
	Arrays.sort(array,String.CASE_INSENSITIVE_ORDER);//Upper and Lower case sort together
	for(String newArray:array) {
		System.out.println(newArray);

	}
	}
}
