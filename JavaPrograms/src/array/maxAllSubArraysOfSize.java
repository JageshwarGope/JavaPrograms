package array;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class maxAllSubArraysOfSize {
	
	public void maxAll(int[] a, int k) {
		
		int i=0; int j=0;
		Deque<Integer> dq = new LinkedList<>();
		List<Integer> list = new ArrayList<>();
		
		while(j < a.length) {
			
			while(!dq.isEmpty() && a[dq.peekLast()] < a[j]) {
				dq.pollLast();
			}
			
			dq.addLast(j);
				
			if(j-i+1 < k) {
				j++;
				
			} else if(j-i+1 == k) {
				
				list.add(a[dq.peekFirst()]);
				
				if(dq.peekFirst() == i) {
					
					dq.pollFirst();
					
				}
				
				i++;
				j++;
				
				
			}
		}
		
		System.out.println(list);
		
	}

	public void maxAll2(int[] a, int k) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i<= a.length-k; i++) {
			
			int max = a[i];
			
			for(int j = i; j<i+k; j++) {
				if(a[j] > max ) {
					max = a[j];
				}
			}
			
			list.add(max);
		}
		
		
		System.out.println(list);
		
	}
	
	
	public static void main(String[] args) {
		
		int[] a = {8,3,1,-1,7,3,19,10,8,4};
		int k = 3;
		
		maxAllSubArraysOfSize ob = new maxAllSubArraysOfSize();
		
		ob.maxAll(a,k);
		ob.maxAll2(a,k);

	}

}
