package stringsProgram;

public class OddEvenString {
	
	public static String change(String st) {
		
		//char[] arr = st.toCharArray();
		
		StringBuilder s = new StringBuilder();
		
		for(int i=0; i<st.length(); i++) {
			
			char ch = st.charAt(i);
			if(i % 2 == 0) {
				s.append(Character.toUpperCase(ch));
			}else {
				s.append(Character.toLowerCase(ch));
			}
		}
		
		return s.toString();
	}
	
	

	public static void main(String[] args) {
		String st = "abcdefghij";
		
		String s = change(st);
		
		System.out.print(s);

	}

}
