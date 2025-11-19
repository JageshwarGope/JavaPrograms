package stringsProgram;

public class reverseWord {
	
	public static String reverseWordd(String st) {
		
		char[] stChar = st.toCharArray();
		int start = 0;
		int end = 0;
		
		for(; end <stChar.length; end++) {
			if(stChar[end] == ' ') {
				reverseCharacter(stChar, start, end-1);
				start = end+1;	
			}
			
		}
		
		reverseCharacter(stChar, start, end-1);
		reverseCharacter(stChar, 0, stChar.length-1);
		return new String(stChar);
	}

	private  static void reverseCharacter(char[] ch, int start, int end) {
		
		while(start < end) {
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			
			start++;
			end--;
		}
		
	}
	
	
	
	
	public static void splitt(String s) {
		
		
//		StringBuilder sb = new StringBuilder(s);
//		sb.reverse();
//		
//		System.out.print(sb);
//		System.out.println();
		
		
		
		String[] st = s.trim().split(" ");   //  st = ["I", "am", "the", "boss"]
		reverseCharacter2(st, 0, st.length-1);
		
		for(String e : st) {
			System.out.print(e+" ");
		}
	}
	
	
	public  static void reverseCharacter2(String[] ch, int start, int end) {
		
		while(start < end) {
			String temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			
			start++;
			end--;
		}
		
	}


	public static void main(String[] args) {

		String a = "I am the boss";
		String s = reverseWordd(a);
		System.out.println(s);
		
		splitt(a);
		

	}

}
