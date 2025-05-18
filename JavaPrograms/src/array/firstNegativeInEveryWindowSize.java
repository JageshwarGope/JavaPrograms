package array;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class firstNegativeInEveryWindowSize {
	

	private static void firstNeg(int[] arr, int s) {
		
		if(arr.length < s) {
			System.out.println("The array does not have "+s+" elements");
		}
		
		for(int i = 0; i<arr.length-s+1; i++) {
			boolean found = false;
			for(int j = i; j<s+i; j++) {
				if(arr[j] < 0) {
					System.out.print(arr[j]+" ");
					found = true;
					break;
				}
				
			}
			
			if(!found) {
				System.out.print("0 ");
			}
		}
		
		
	}
	
	private static void firstNeg2(int[] arr, int s) {
		
		if(arr.length < s) {
			System.out.println("The array does not have "+s+" elements");
		}
		
		int left = 0;
		int right = 0;
		List<Integer> list = new ArrayList<>();
		Deque<Integer> dq = new LinkedList<>();
	
		while(right < arr.length) {
			
			if(arr[right] < 0) {
				dq.addLast(arr[right]);
			}
			
			if(right-left+1 < s) {
				right++;
			} else if(right-left+1 == s) {
				
				if(!dq.isEmpty()) {
					list.add(dq.peekFirst());
				}else {
					list.add(0);
				}
				
				if(!dq.isEmpty() && arr[left] == dq.peekFirst()) {
					dq.pollFirst();
				}
				
				left++;
				right++;
				
			}
			
			
		}
		
		System.out.println();
		System.out.println(list);
		
	}



	public static void main(String[] args) {
		
		int arr[] = {2,-1,-3,5,-4,3,5,8,-3,5,6,-5,-3};
		int windowSize = 3;
		
		firstNeg(arr, windowSize);
		firstNeg2(arr, windowSize);
	}

}
