package RahulSetty25Questions;

public class ReverseString {
	
	public static void reverse(String s) {
		
		int len = s.length();
		
		char[] arr = new char[len];
		int j=0;
		
		for(int i = len-1; i>=0; i--) {
			arr[j++] = s.charAt(i);
		}
		
		for(char ch : arr) {
			System.out.print(ch);
		}
		
	//	or
		
		System.out.println();
		
		new String(arr);
		System.out.println(arr);
		
		
	}
	
	public static void revers2(String s) {
		
		String s2 = new StringBuilder(s).reverse().toString();
		System.out.println(s2);
	}
	
	
	public static void reverse3(String s) {
		
		String result = "";
		
		for(int i = s.length()-1; i>=0; i--) {
			result = result + s.charAt(i);
		}
		
		System.out.println(result);
		
		
	}
	

	public static void main(String[] args) {
		
		String st = "abcde";
		reverse(st);
		revers2(st);
		reverse3(st);

	}

}
