

public class rough {
	
	public static int subsequence(String a) {
		
		
		for(int i = 0; i<a.length()-1; i++) {
			for(int j = i+1; j<a.length(); j++) {
				if(a.charAt(i) == a.charAt(j)) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		
		String a = "Rahulkumar";
		//String b = "abbc";
		int  f = subsequence(a);
		if(f == -1) {
			System.out.println("repeat not found");
		} else {
			System.out.println(a.charAt(f));
		}
		
		
		
		
		
		

	}

	
	
}

