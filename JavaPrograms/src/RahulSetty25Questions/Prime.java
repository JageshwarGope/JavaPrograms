package RahulSetty25Questions;

public class Prime {

	public static void main(String[] args) {
		
		int n = 10;
		boolean res = true;
		if(n < 2) {
			res = false;
		}
		
		for(int i = 2; i<=n/2; i++) {
			if(n % i == 0) {
				res = false;
			}
			
		}
		
		if(res) {
			System.out.println(n+" is a prime number");
		}else {
			System.out.println(n+" is not a prime number");
		}
	}

}
