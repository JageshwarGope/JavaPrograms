package stringsProgram;

import java.util.Arrays;

public class anagram {
	
	public static void anagramProgram(String a, String b) {  // O(n) + O(m) which is lower than O(nlogn)
		
		int s1 = stringToASCII(a);
		int s2 = stringToASCII(b);

		if(s1 == s2) {
			System.out.println(a+" and "+b+" are anagram");
		} else {
			System.out.println(a+" and "+b+" are Not an anagram");
		}
	}
	
	public static int stringToASCII(String s) {
		
		int ascii = 0;
		for(int i=0; i<s.length(); i++) {
			int ch = (int) s.charAt(i);  // or int num = (int) s.charAt(i);
			int num = (char) ch;
			ascii = ascii+num;
		}
		
		return ascii;
	}
	
	
	public static void anagramProgram2(String s1, String s2) {
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)) {
			System.out.println(s1+" and "+s2+" are anagram");
		} else {
			System.out.println(s1+" and "+s2+" are Not an anagram");
		}
	}
	

	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "cab";
		
		anagramProgram(s1,s2);
		anagramProgram2(s1,s2);
	}

}
