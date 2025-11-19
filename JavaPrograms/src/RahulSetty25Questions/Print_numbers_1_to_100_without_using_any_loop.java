package RahulSetty25Questions;

public class Print_numbers_1_to_100_without_using_any_loop {
	
	public static void reccurssion(int a) {
		
		if(a <= 100) {
			System.out.println(a);
			a++;
			reccurssion(a);
		}
	}

	public static void main(String[] args) {
		
		reccurssion(1);

	}

}
