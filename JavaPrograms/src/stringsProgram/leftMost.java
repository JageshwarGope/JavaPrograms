package stringsProgram;

public class leftMost {
	
	// brute force
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
		
		String s = "adfskuskl";
		
		int a[] = new int[256];
		
		for(int i = 0; i<s.length(); i++) {
			a[s.charAt(i)]++;
		}
		
		for(int i = 0; i<s.length(); i++) {
			if(a[s.charAt(i)] > 1) {
				
				System.out.println(s.charAt(i));
				return; // return means exit from  method and not execute below codes but break will exit from loop only and execute below codes 
			}

		}
		
		System.out.println("no repeating");

	}

}
