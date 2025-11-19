package RahulSetty25Questions;

public class Sum {

	public static void main(String[] args) {
		
		int n = 12345;
		int temp = n;
		int result = 0;
		
		while(temp > 0) {
			int digit = temp % 10;
			result = result + digit;
			temp = temp / 10;
		}
		
		System.out.println("Sum of "+n+" is "+result);

	}

}
