package RahulSetty25Questions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iterate_through_the_HashMap {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		
		map.put(0, "rahul");
		map.put(1, "kumar");
		map.put(2, "Jagu");
		map.put(2, "Raazzz");  // update
		map.replace(1, "tumbin");  // update
		
		System.out.println(map);
		
		Iterator<Integer> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			int key = it.next();
			String value = map.get(key);
			System.out.println(key +" : "+value );
		}
		
		System.out.println("---------------------");
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue()); 
		}
		
		System.out.println("---------------------");
		
		
		for(int key : map.keySet()) {
			System.out.println(key +" : "+map.get(key) );
		}

	}

}
