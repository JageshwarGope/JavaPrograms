package sorting;

public class BubbleShort {
	
	public static void bubble(int[] arr) {
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j , j+1);
				}
			}
		}
		
	}
	
	public static void swap(int[] arr, int a, int b) {
		
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void main(String[] args) {
		
		int[] arr = {5,2,7,5,1,5,8,2};
		bubble(arr);
		
		for(int a : arr) {
			System.out.print(a);
		}

	}

}
