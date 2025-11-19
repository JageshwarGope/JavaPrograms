package RahulSetty25Questions;

public class Fibonnaci {

	public static void fibnac(int upto) {

		int a = 0, b = 1;
		int c;
		System.out.print(a);
		System.out.print(b);
		while (true) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c);
			if(c > upto) {
				break;
			}
		}

	}

	public static void main(String[] args) {

		int upto = 10;
		fibnac(upto);

	}
}
