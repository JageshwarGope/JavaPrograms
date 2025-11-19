package RahulSetty25Questions;

public class Maximum_Consecutive_Ones {
	
	public static void ConsecutiveOnes(int[] a) {
		
		int currentCount = 0;
		int max = 0;
		
		for(int i = 0; i<a.length; i++) {
			if(a[i] == 1) {
				currentCount++;
			}else {
				currentCount = 0;
			}
			
			max = Math.max(max,currentCount);
		}
		
		System.out.println(max);
	}

	public static void main(String[] args) {
		
		int a[] = {1,1,0,3,5,1,1,1,1,5,1,1};
		
		ConsecutiveOnes(a);

	}

}
