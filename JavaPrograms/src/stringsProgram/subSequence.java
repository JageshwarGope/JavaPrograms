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

	public static void main(String[] args) {
		
		String seq = "abbcddon";
		String sub = "acco";
		
		subSeq(seq, sub);

	}

}
