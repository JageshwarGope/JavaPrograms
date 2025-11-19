package RahulSetty25Questions;

public class Product_of_an_array_except_self {
	
	public static int[] product(int[] a) {
		
		int[] b = new int[a.length];
		int product;
		
		for(int i = 0; i<a.length; i++) {	
			product = 1;
			for(int k = 0 ; k<a.length; k++) {
				if(k != i) {
					 product = product * a[k];
				}
				
				b[i] = product;
				
			}
			
		}
		
		return b;
	}

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4};
		int b[] = product(a);
		for(int c : b) {
			System.out.print(c+" ");
		}
		

	}

}
