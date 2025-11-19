package RahulSetty25Questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class First_non_repeating_character {
	
	public static void unique(String s) {
		
		char result = 0;
		for (int i = 0; i < s.length(); i++) {
			boolean isUnique = true;

			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j) && i != j) {
					isUnique = false;
					break;

				}
			}
				
				if (isUnique) {
					result = s.charAt(i);
					break;
				}

		}
		if (result == 0) {
			System.out.println("No unique charaters found");
		} else {
			System.out.println(result);
		}
	}
	
	
	public static void uniqueUsingHasSet(String s) {
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(char c : s.toCharArray()) {
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
			
			//-----new way if dont wnat to use if else 
//			for (char c : s.toCharArray()) {
//			    map.put(c, map.getOrDefault(c, 0) + 1);
//			}
//			
			
//			✔ If c is new → map.getOrDefault(c, 0) returns 0
//
//			→ 0 + 1 = 1
//			→ map.put(c, 1) adds the character with count 1.
//
//			✔ If c already exists → returns existing count
//
//			→ Example: for 'l', existing count: 1
//			→ 1 + 1 = 2
//			→ map.put(c, 2) updates the count.
			
		}
		
		for(char unique : map.keySet()) {
			if(map.get(unique) == 1) {
				System.out.println(unique);
				break;
			}
		}
		
	}

	public static void main(String[] args) {

		String s = "helloh";
		
		unique(s);
		uniqueUsingHasSet(s);

	}

}
