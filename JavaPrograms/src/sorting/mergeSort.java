package sorting;

import java.util.ArrayList;
import java.util.List;

public class mergeSort {

	
	public static void mergeSortt(int[] a, int st, int end) {
		
		if(st<end) {
			int mid = st + (end-st)/2;
			
			mergeSortt(a, st , mid);
			mergeSortt(a, mid+1 , end);
			
			merge(a, st, mid, end);
			
		}
	}
	
	
	private static void merge(int[] a, int st, int mid, int end) {
		
		List<Integer> temp = new ArrayList<>();
		int i = st;
		int j = mid+1;
		
		while(i<=mid && j<=end) {
			if(a[i] <= a[j]) {
				temp.add(a[i]);
				i++;
			} else {
				temp.add(a[j]);
				j++;
			}
			
		}
		
		while(i<=mid) {
			temp.add(a[i]);
			i++;
		}
		
		while(j<=end) {
			temp.add(a[j]);
			j++;
		}
		
		for(int k = 0; k< temp.size(); k++) {
			a[st + k] = temp.get(k);
		}
		
	}


	public static void main(String[] args) {
		
		int[] a = {6,2,9,4,7,3,4,9,3};
		
		mergeSortt(a, 0, a.length-1);
		
		for(int b : a ) {
			System.out.print(b);
		}
		
	}

}
