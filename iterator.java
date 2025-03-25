package exception;
import java.util.*;
public class iterator {
	public static void main (String[]args) {
		ArrayList<String>fruits=new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("cherry");
		Iterator<String>iterator=fruits.iterator();
		System.out.println("fruits using iterator:");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}