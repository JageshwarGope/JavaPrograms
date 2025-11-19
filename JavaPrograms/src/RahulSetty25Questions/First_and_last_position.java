package RahulSetty25Questions;

public class First_and_last_position {
	
	public static void FLpossition(int[] a, int t) {
	
		int firstPossion = -1;
		int lastPossion = -1;
	for(int i = 0; i<a.length; i++) {
		if(a[i] == t) {
			firstPossion = i;
			break;
		}
	}
	
	for(int i = a.length-1; i>=0; i--) {
		if(a[i] == t) {
			lastPossion = i;
			break;
		}
	}
	
	
	System.out.println("First possitopn is " +(firstPossion+1));
	System.out.println("Last possitopn is " +(lastPossion+1));

	
	}
	
	public static void usingTwoPointer(int[] a, int t) {  // using 2 pointer
		
		int left = 0;
		int right = a.length-1;
		
		int first = -1;
		int last = -1;
		
		while(left<=right) {
			
			if(a[left] == t && first == -1) {
				first = left;
			}else {
				left++;
			}
			
			if(a[right] == t && last == -1) {
				last = right;
			}else {
				right--;
			}
			
			if(first != -1 && last != -1) break;
		}
		
		
		System.out.println("First possition is " +(first+1));
		System.out.println("Last possition is " +(last+1));
		
	}
	
	
	
	public static void main(String[] args) {
		
		int[] a = {1,2,5,8,5,2,3,5,7,9,4};
		int target = 5;
		
		FLpossition(a, target);
		usingTwoPointer(a, target);
		
	}

}
