package array;

import java.util.Arrays;

public class countOccurenceInAnagram {
	
	private static int countOccAnagram(String st, String pattern) {
		
		int[] stFreq = new int[26];
		int[] patFreq = new int[26];
		int i = 0;
		int j = 0;
		int count = 0;
		
		for(char c : pattern.toCharArray()) {
			patFreq[c - 'a']++;
		}
		
		while(j < st.length()) {
			
			stFreq[st.charAt(j) - 'a']++;
			
			if(j-i+1 < pattern.length()) {
				j++;
			} else if(j-i+1 == pattern.length()) {
				if(Arrays.equals(stFreq, patFreq)) {
					count++;
				}
				
				stFreq[st.charAt(i) - 'a']--;
				i++;
				j++;
			}
		}
		
		return count;
	
	}
	
	private static void countOccAnagram2(String st, String pattern) {
		
		char[] stChar = st.toCharArray();
		char[] pChar = pattern.toCharArray();

		int count = 0;
		
		for(int i = 0; i<st.length(); i++ ) {
			for(int j = i; j<pattern.length(); j++) {
				if(pattern.contains(st.charAt(i))){
					
				}
			}
		}
		
	
	}
	
	
	public static void main(String[] args) {
		
		String st = "cbaebabacd";
		String pattern = "abc";
		
		int result = countOccAnagram(st,pattern);
		System.out.println(result);

	}


}
