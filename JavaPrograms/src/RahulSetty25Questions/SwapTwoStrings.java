package RahulSetty25Questions;

public class SwapTwoStrings {
	
	public void swapString(String s1, String s2) {
		
		String temp = s1;
		s1 = s2;
		s2 = temp;
		
		System.out.println(s1);
		System.out.println(s2);
	}

	public static void main(String[] args) {
		
		String abc = "abc";
		String xyz = "xyz";
		
		SwapTwoStrings ob = new SwapTwoStrings();

		System.out.println("Before swap");
		System.out.println(abc);
		System.out.println(xyz);
		
		System.out.println("After swap");
		ob.swapString(abc,xyz);
		
		//   or simple without temp or third variable
		
		System.out.println();
		
		abc = abc+xyz;
		xyz = abc.substring(0, abc.length() - xyz.length());  // start 0 to 6-3 = 3 3 is excluded
		System.out.println(xyz);
		abc = abc.substring(xyz.length());  // start from 3 to end
		System.out.println(abc);
		

	}

}
