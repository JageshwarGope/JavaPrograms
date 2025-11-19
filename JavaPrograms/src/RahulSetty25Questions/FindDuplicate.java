package RahulSetty25Questions;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicate {

	public static void duplicate(String s) {

		char[] arr = new char[s.length()];
		int l = 0;
		int k;
		for (int i = 0; i < s.length(); i++) {
			boolean foundAgain = false;
			for (char c : arr) {
				if (c == s.charAt(i)) {
					foundAgain = true;
					break;
			}
			}
			if (foundAgain)
				continue;
			k = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j) && i != j) {
					k++;
				}
			}
			if (k >= 1) {
				arr[l++] = s.charAt(i);
			}
		}

		String foundDuplicates = new String(arr);
		System.out.print(foundDuplicates);
	}
	
	public static void duplicateChar(String s) {
		
		HashMap<Character,Integer> hashMap = new HashMap<>();
		char[] arr = s.toCharArray();
		
		for(char c : arr) {
			if(hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c)+1);
			}else {
				hashMap.put(c, 1);
			}
		}
		
//		Set<Character> set = hashMap.keySet();
//		
//		for(char c : set) {
//			if(hashMap.get(c)>1) {
//				System.out.println(c+" -- "+hashMap.get(c));
//				
//			}		
	// without set as all are already unique keys so we ca directly use hashMap	--- set is just a way of doing iterate		
				
			for(char c : hashMap.keySet()) {
				if(hashMap.get(c)>1) {
					System.out.println(c+" -- "+hashMap.get(c));
					
				}			
				
//				🔹 Even more efficient option (modern style)
//
//				You can also use the entrySet() to loop through both key and value together — which avoids repeatedly calling hashMap.get(c):
//
//				for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
//				    if (entry.getValue() > 1) {
//				        System.out.println(entry.getKey() + " -- " + entry.getValue());
//				    }
//				}

		}
	}
		
	

	
	

	public static void main(String[] args) {

		String s = "jageshwaryadddvgh";

		duplicate(s);
		System.out.println();
		duplicateChar(s);

	}

}
