package array;

public class largestSubArrayOfSumK {
	
	public static int brute(int[] a, int k) {
		
		int curSum = 0;
		int length = 0;
		for(int i = 0; i<a.length-1; i++) {
			curSum = a[i];
			
			for(int j = i+1; j<a.length; j++) { 
					curSum = curSum + a[j];
				 if(curSum == k) {
					length = Math.max(length, j+1);
				}
			}
		}
		
		return length;

	}
	
	public static int slidingW(int[] a, int k) {
		
		int length = 0;
		int i = 0; int j= 0;
		int curSum = a[i];
		while(j < a.length) {
			
			curSum = curSum+a[j];
			
			if(curSum == k) {
				
				length = Math.max(j+1, length);
			}
		}
		
		return length;
	}
	

	public static void main(String[] args) {
		int[] a = {2,4,7,4,0,-4};
		int k = 13;
		int l = brute(a,k);
		System.out.println("maximum sub array = "+l);
}
	
	}
