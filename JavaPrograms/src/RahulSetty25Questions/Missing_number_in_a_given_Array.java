package RahulSetty25Questions;

public class Missing_number_in_a_given_Array {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,6,7,8};
		boolean found = false;
		int i;
		for(i = 0; i<a.length; i++) {
			if(a[i]+1 != a[i+1]) {
				found = true;
				break;
			}
		}
		
		if(found) {
			System.out.println(a[i]+1);
		}
		else {
			System.out.println("Not Found");
		}
		



	}

}
