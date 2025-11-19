package sorting;

public class InsertionSort {
	
	private static void insertion(int[] a) {
		
		for(int i = 1; i<a.length; i++) {
			int temp = a[i];
			int j = i-1;
			while( j >= 0 && a[j] > temp ){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = temp;
		}
		
	}


	public static void main(String[] args) {
		
	int a[] = {5,2,8,5,9,3,2};
	
	insertion(a);
	
	for(int b: a) {
		System.out.print(b);
	}

	}

	
}
