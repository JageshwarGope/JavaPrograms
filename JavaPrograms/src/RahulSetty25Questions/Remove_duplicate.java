package RahulSetty25Questions;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicate {

	public static void remove(int[] a) {
	    int[] b = new int[a.length];
	    int k = 0;

	    for (int i = 0; i < a.length; i++) {
	        boolean duplicate = false;

	        for (int j = 0; j < i; j++) {
	            if (a[i] == a[j]) {
	                duplicate = true;
	                break;
	            }
	        }

	        if (!duplicate) {
	            b[k++] = a[i];
	        }
	    }

	    // Print only unique portion of b
	    for (int i = 0; i < k; i++) {
	        System.out.print(b[i] + " ");
	    }
	}

	

	public static void remove2(int[] a) {
		
		Set<Integer> set = new LinkedHashSet<>();
		
		for(int e : a) {
			set.add(e);
		}
		
		System.out.println(set);
		
	}
	

	public static void main(String[] args) {

		int[] a = { 1,9, 2, 3, 4, 4, 4, 6, 7, 3, 1, 2, 5, 8 };
		remove2(a);
		remove(a);

	}
}
