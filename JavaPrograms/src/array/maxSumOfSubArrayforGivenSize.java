package array;

public class maxSumOfSubArrayforGivenSize {
	
	public static int maxS3(int[] arr, int size) {
		
		if(arr.length < 3) return -1;
		
		int left = 0;
		int right = 0;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		while(right < arr.length) {
			sum = sum + arr[right];
			if(right-left+1 < size) {
				right++;
			} else if(right-left+1 == size) {
				max=Math.max(max, sum);
				sum = sum - arr[left];
				left++;
				right++;
				
			}
		}
		
		
		return max;
	
	}
	
	
	public static int maxS2(int[] arr, int size) {
		
		if(arr.length < 3) return -1;
		
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i = 0; i < size; i++) {
			
			sum = sum + arr[i];
		}
		
		max = sum;
		
		for(int i = size; i < arr.length; i++) {
			sum = sum + arr[i] - arr[i-size];
			max = Math.max(max, sum);
		}
		return max;
	
	}
	
	// brute force
	public static int maxS1(int[] arr, int size) {
		
		if(arr.length < 3) return -1;
		
		int max = Integer.MIN_VALUE;
		int sum;
		
		for(int i = 0; i < arr.length-2; i++) {
			sum = 0;
			for(int j = i; j < size+i; j++) {
				sum = sum + arr[j];
			}
			
			max = Math.max(max, sum);
			
		}
		
		
		return max;
	
	}

	public static void main(String[] args) {
		
		int[] arr = {4,2,6,8,5,3,2,1,5,1,9,3,6,9};
		int s = 3;
		
		int maxSum1 = maxS1(arr,s);
		System.out.println(maxSum1);
		

		int maxSum2 = maxS2(arr,s);
		System.out.println(maxSum2);
		
		int maxSum3 = maxS3(arr,s);
		System.out.println(maxSum3);
		
	}

}
