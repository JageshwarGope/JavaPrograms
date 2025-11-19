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
	
	// stringToASCII  method
	
	public static int stringToASCII(String s) {
		
		int ascii = 0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);  // or int num = (int) s.charAt(i);
			int num = ch;
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
	
	public static boolean  anagramProgram3(String s1, String s2) {
		
		int[] n = new int[256];
		
		for(int i = 0; i<s1.length(); i++) {
			n[s1.charAt(i)]++;
		}
		
		for(int i = 0; i<s2.length(); i++) {
			n[s2.charAt(i)]--;
		}
		
		for(int a : n) {
			if(a != 0) {
				return false;
			} 
		}
		
		return true;
		
		
	}
 
	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "cab";
		
		anagramProgram(s1,s2);
		anagramProgram2(s1,s2);
		boolean res = anagramProgram3(s1,s2);
		if(res) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}

}
