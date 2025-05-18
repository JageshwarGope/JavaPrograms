package stringsProgram;

public class subSequence {
	
	public static void subSeq(String seq, String sub) {
		
		int i = 0;
		for(int j=0; j<seq.length(); j++) {
			if(sub.charAt(i) == seq.charAt(j)) {
				i++;
				if(i == sub.length()) break;
			}
		}
		
		if(i==sub.length()) {
			System.out.println("it is subsequence");
		} else {
			System.out.println("not a subsequence");
		}
	}
	
	
	public static void subsequence(String a, String b) {
		
		int count = 0;
		int j = 0;
		for(int i = 0; i<b.length(); i++) {
			for(; j<a.length(); j++) {
				if(b.charAt(i) == a.charAt(j)) {
					count++;
					j++;
					break;
				}
			}
		}
		
		if(count == b.length()) {
			System.out.println("Subsequence");
		}else {
			System.out.println("Not a Subsequence");
		}
		
		
	}

	public static void main(String[] args) {
		
		String seq = "abbcddon";
		String sub = "acco";
		
		subSeq(seq, sub);
		subsequence(seq, sub);

	}

}
