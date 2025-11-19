package RahulSetty25Questions;

public class SwapNumbers {

	SwapNumbers(int a, int b) {

		int temp = a;
		a = b;
		b = temp;

		System.out.println("After swap");
		System.out.println(a + " and " + b);

	}

	public void swap(int a, int b) {

		a = a + b; // 2+3=5
		b = a-b;  //  5-3=2
		a = a-b; // 5-2=3

		System.out.println("After swap");
		System.out.println(a + " and " + b);

	}

	public static void main(String[] args) {

		int a = 2;
		int b = 3;

		System.out.println("Before swap");
		System.out.println(a + " and " + b);
		SwapNumbers ob = new SwapNumbers(a, b);
		ob.swap(a, b);

	}

}
