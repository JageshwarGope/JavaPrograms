package RahulSetty25Questions;

public class ArmStrong {

	public static void main(String[] args) {
		
		int n = 372;
		int temp = n;
		int result = 0;
		
		while(temp > 0) {
			int digit = temp % 10;
			result = result + digit*digit*digit;
			temp = temp/10;
			
		}
		if(result == n){
			System.out.println("The given number is armstrong");
		}else {
			System.out.println("The given number is not armstrong");
		}
		

	}

}
