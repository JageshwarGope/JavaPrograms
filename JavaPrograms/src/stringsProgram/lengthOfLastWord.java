package stringsProgram;

public class lengthOfLastWord {
	
	public static void lastWordLength(String s) {
		
		String[] r = s.trim().split(" ");
		System.out.println(r[r.length-1].length());
	}
	
	public static void lastWordLength2(String s) {

		s = s.trim();
		int length = 0;
		for(int i = s.length()-1; i>=0; i--) {
			
			if(s.charAt(i) == ' ') 
				break;
				
			length++;
			
		}
		
		System.out.println(length);
		
	}

	public static void main(String[] args) {
		
		String s = "hello sir jiii ";
		lastWordLength(s);
		lastWordLength2(s);
	}

}
