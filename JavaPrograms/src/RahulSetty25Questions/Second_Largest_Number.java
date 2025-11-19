package RahulSetty25Questions;

public class Second_Largest_Number {

	public static void main(String[] args) {
		
		int[] a = {5,1,3,9,6,4,7,9};
		
		int largestIndex = 0;
		int secLarIndex = -1;
		
		for(int i = 0; i<a.length; i++) {
			if(a[i] > a[largestIndex]) {
				secLarIndex = largestIndex;
				 largestIndex = i;
			}else if((secLarIndex == -1 || a[i] > a[secLarIndex]) && a[i] < a[largestIndex] ) {
				secLarIndex = i;
			}
		}
		if(secLarIndex == -1) {
			System.out.println("No second largest found");
		}else {
			System.out.println(a[secLarIndex]);
		}
		

	}

}
