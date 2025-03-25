package exception;
import java.util.*;
public class hashmap {
	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		//adding key-values pairs
		/*map.put("Apple",3);
		map.put("Banana",2);
		map.put("Orange",5);
		System.out.println("HashMap:"+map);
		/*System.out.println("Apple Count->"+map.get("Apple"));//get
		//checking if a key exists
		if(map.containsKey("Banana")) {
			System.out.println("Banana is in the map");
		}
		map.remove("Orange");
		System.out.println("After removing Orange:"+map);//remove
		System.out.println("size of HashMap:"+map.size());//size*/

	
	

	System.out.println("Iterating using entrySet:");
	for(Map.Entry<String,Integer>entry:map. entrySet()) {
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
	
	
	map.put("Orange",5);
	System.out.println("Iterating using keySet:");
	for(String Key:map.keySet()) {
		System.out.println(Key+":"+map.get(Key));
	
	}
	}
}

	
	


