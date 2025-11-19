package RahulSetty25Questions;

import java.util.HashMap;

public class CountCharacters {
	
	public static void count(String s) {
		
		char[] arr = new char[s.length()];
		int l=0;
		int k;
		for(int i = 0; i<s.length(); i++) {
			boolean found = false;
			for(char c : arr) {
				if(c == s.charAt(i)) {
					found = true;
					break;
				}
			}
			if(found) 
				continue;
			
			k=0;
			for(int j = 0; j<s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {
					k++;
				}			
				
			}
			System.out.println("count of "+s.charAt(i)+" is "+k+" times" );
			arr[l++] = s.charAt(i);
		}
	}
	
	
	public static void countUsingHashMap(String s) {
		
		HashMap<Character,Integer> hashMap = new HashMap<>();
		char[] charArray = s.toCharArray();
		for(char c : charArray) {
			if(hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c)+1);
			}else {
				hashMap.put(c,1);
			}
		}
		
		System.out.println(hashMap);
		
	}
	public static void main(String[] args) {
		
		String s = "abcdefghabkjscdlmeaaksdvfwrgha";
		
		count(s);
		countUsingHashMap(s);

	}

}
