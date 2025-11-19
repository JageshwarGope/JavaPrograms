package RahulSetty25Questions;

public class CountOfCapitalizedWords {  //get all the words start with a capital letter
	
	public static void count(String s) { //total count of capital letter not the word
		
		int count=0;
		for(int i = 0; i<s.length(); i++) {
				if(s.charAt(i) >='A' && s.charAt(i) <= 'Z') {
					count++;
				}
				
		}
		
		System.out.println(count);
		
	}
	
	public static void count3(String s) { 
		
		int count=0;
		
		for(int i = 0; i<s.length(); i++) {
			
			if((s.charAt(i) == ' ' && s.charAt(i+1) >='A' && s.charAt(i+1) <= 'Z' ) || ( i == 0 && s.charAt(0) >='A' && s.charAt(0) <= 'Z' )) {
				count++;
			}		
		}
		
		System.out.println(count);
		
	}
	
	public static void count2(String s) {
		
		String[] st = s.trim().split("\\s+");
		int c = 0;
		for(String str : st) {
			if(!str.isEmpty() && Character.isUpperCase(str.charAt(0))) {
				c++;
			}
			
		}
		
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		String s = "Hi i am Very   Smart bUt You look awesome";
		
		count(s);
		count2(s);
		count3(s);
				
				

	}

}
