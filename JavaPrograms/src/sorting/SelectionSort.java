package sorting;

public class SelectionSort {
	
	public void selection(int[] a) {
		
		for(int i = 0; i<a.length-1; i++){
			int minIndex = i;
			for(int j = i+1; j<a.length; j++) {
				if(a[j] < a[minIndex]) {
					minIndex = j;
				}
			}
			
			swap(a,minIndex,i);
		}
		
	}

	public void swap(int[] a, int min, int i) {
		
		int temp = a[min];
		a[min] = a[i];
		a[i] = temp;
		
	}
	public static void main(String[] args) {
		
		int[] a = {5,2,7,9,5,3,7};
		
		SelectionSort ob = new SelectionSort();
		ob.selection(a);
		
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i]);
		}
		
	}

}
