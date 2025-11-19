package RahulSetty25Questions;

public class LongestConsecutive {

	public static void longest(int[] a) {

		int current = 0;
		int max = 0;
		for (int i = 0; i <= a.length - 2; i++) {
			// current = current + a[i];
			if (a[i] + 1 == a[i + 1]) {
				current++;
			} else {
				current = 0;
			}
			
			max = Math.max(max, current+1);
		}
		System.out.println(max);

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 7, 5, 2, 5, 6, 7, 8, 9, 3, 2 };

		longest(arr);

	}

}
