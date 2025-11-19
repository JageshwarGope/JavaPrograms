package RahulSetty25Questions;

public class shift_all_zeros_on_the_right {

	public static void main(String[] args) {

		int[] a = { 3, 5, 2, 0, 6, 0, 0, 5, 3, 0, 4, 0, 2, 1, 0, 0, 3, 3 };
		int n = a.length;
		int[] b = new int[n];
		int j = 0;
	
		for (int i = 0; i < a.length; i++) {
			if(a[i] != 0) {
				b[j++] = a[i];
			}
		}
		
		for(int e : b) {
			System.out.print(e);
		}
		
	}

}
